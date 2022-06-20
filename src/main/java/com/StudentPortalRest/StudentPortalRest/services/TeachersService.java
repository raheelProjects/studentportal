package com.StudentPortalRest.StudentPortalRest.services;

import java.util.List;

import com.StudentPortalRest.StudentPortalRest.entity.Teachers;

public interface TeachersService {
	
	List<Teachers> getTeachers();
	
	public String addTeacher(Teachers t);
	
	public String updateTeacher(Teachers t);
	
	public String deleteTeacher(int id);

}
