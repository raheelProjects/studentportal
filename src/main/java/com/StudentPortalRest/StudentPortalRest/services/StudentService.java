package com.StudentPortalRest.StudentPortalRest.services;

import com.StudentPortalRest.StudentPortalRest.entity.Students;
import java.util.LinkedList;

public interface StudentService {
	
	public LinkedList<Students> getStudents();
	
	public Students getStudent(int id);
	
	public String addStudent(Students st);
	
	public String updateStudent(Students st);
	
	public String deleteStudent(int id);

}
