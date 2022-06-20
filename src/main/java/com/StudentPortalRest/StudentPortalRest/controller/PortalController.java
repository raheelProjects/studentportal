package com.StudentPortalRest.StudentPortalRest.controller;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.StudentPortalRest.StudentPortalRest.entity.Events;
import com.StudentPortalRest.StudentPortalRest.entity.Students;
import com.StudentPortalRest.StudentPortalRest.entity.Teachers;
import com.StudentPortalRest.StudentPortalRest.services.EventService;
import com.StudentPortalRest.StudentPortalRest.services.StudentService;
import com.StudentPortalRest.StudentPortalRest.services.TeachersService;

import java.util.HashMap; 
@RestController
public class PortalController {
	@Autowired
	StudentService ss;
	
	@Autowired
	EventService que;
	
	@Autowired
	TeachersService te;
	
	// Admin get method
	
	@GetMapping("/admin")
	public String login(@RequestBody  HashMap<String, String> username) {
		try {
			String un =username.get("username");
			String pass =username.get("password");
		if (un.equalsIgnoreCase("admin") & pass.equalsIgnoreCase("admin")) {
		return "success";	
		}
		return "failure";
		}catch(Exception e) {
		return e.toString();}
	}
	
	@GetMapping("/admin/students")
	public LinkedList<Students> students() {
		return ss.getStudents();
		
	}
	
	@GetMapping("/admin/teachers")
	public List<Teachers> getteachers() {
		return te.getTeachers();
		
	}
	
	@GetMapping("/admin/students/{studentid}")
	public Students student(@PathVariable String studentid) {
		return ss.getStudent(Integer.parseInt(studentid));
		
	}
	
	
	// Admin post method

	@PostMapping("/admin/students")
	public String addStudent(@RequestBody Students st) {
		return ss.addStudent(st);
		
	}
	
	@PostMapping("/admin/events")
	public String addEvent(@RequestBody Events e) {
		return que.addEvent(e);
		
	}
	
	
	// Admin update method
	
	@PutMapping("/admin/students")
	public String updateStudent(@RequestBody Students st) {
		return ss.updateStudent(st);
		
	}
	
	@PutMapping("/admin/teachers")
	public String updateteacher(@RequestBody Teachers t) {
		return te.updateTeacher(t);
		
	}
	
	// Admin delete method
	
	@DeleteMapping("/admin/students")
	public String deleteStudent(@RequestBody HashMap<String, Integer> info ) {
		return ss.deleteStudent(info.get("id"));
		
	}
	
	@DeleteMapping("/admin/teachers")
	public String deleteTeacher(@RequestBody HashMap<String, Integer> info ) {
		return te.deleteTeacher(info.get("id"));
		
	}
	
	// get event method
	
	@GetMapping("/events")
	public Queue<Events> getEvents() {
		return que.getEvents();
	}
	
	


}
