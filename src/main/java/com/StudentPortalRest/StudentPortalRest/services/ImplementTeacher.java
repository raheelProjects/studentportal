package com.StudentPortalRest.StudentPortalRest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.StudentPortalRest.StudentPortalRest.entity.Teachers;

@Service
public class ImplementTeacher implements TeachersService {
	
	List<Teachers> lt;
	
	
	ImplementTeacher(){
		
		lt = new ArrayList<Teachers>();
		lt.add(new Teachers(32,"Miss fatima",302,"ionsdo34h"));
		lt.add(new Teachers(30,"Miss nida",217,"nounio"));
		lt.add(new Teachers(91,"Sir",192,"m5uhbf"));
	}

	public Teachers findteacher(int id) {
		Teachers t =null;
		for (Teachers teacher : lt) {
			if (teacher.getTeacherid()==id) {
				t = teacher;
				break;
			}
		}
		return t;
	}
	
	@Override
	public List<Teachers> getTeachers() {
		return lt;
	}

	@Override
	public String addTeacher(Teachers t) {
		lt.add(t);
		return "Teacher Created : \n"+t.toString();
	}

	@Override
	public String updateTeacher(Teachers t) {
		
		Teachers te = findteacher(t.getTeacherid());
		if(te!=null) {
			te.setTeacher(t);
			return "Teacher updated : "+t.getTeacherid();
		}
		
		return "no Teacher record found";
	}

	@Override
	public String deleteTeacher(int id) {
		Teachers te = findteacher(id);
		if(te!=null) {
			lt.remove(te);
			return "Teacher removed : "+te.getTeacherid();
		}
		
		return "no Teacher record found";
	}
	
	
}
