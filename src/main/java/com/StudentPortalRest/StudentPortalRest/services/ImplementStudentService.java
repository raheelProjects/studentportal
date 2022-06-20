package com.StudentPortalRest.StudentPortalRest.services;

import java.util.LinkedList;

import org.springframework.stereotype.Service;

import com.StudentPortalRest.StudentPortalRest.entity.Students;

@Service
public class ImplementStudentService implements StudentService {
	
	LinkedList<Students> listofStudents;
	
	public ImplementStudentService() {
		
		listofStudents =new LinkedList<Students>();
		listofStudents.add(new Students("Raheel", "Jamshaid", 239, 2.92, "95%", "Hnm'340fh"));
		listofStudents.add(new Students("Bisham", "Khan", 227, 3.0, "82%", "Gjns34fh"));
		listofStudents.add(new Students("Abdul Rehman", "Farooqi", 236, 2.92, "95%", "Hnm'340fh"));
		
	}
	
	public Students findStudent(int rollno) {
		Students stu = null;
		
		for (Students student : listofStudents) {
			if (student.getRollno() == rollno) {
				stu = student;
				break;
			}
		}
		
		return stu;
	}

	@Override
	public LinkedList<Students> getStudents() {
		return listofStudents;
	}

	@Override
	public Students getStudent(int id) {
		Students student = findStudent(id);
		
		return student;
	}

	@Override
	public String addStudent(Students st) {
		try {
		listofStudents.add(st);
		return st.toString();
		}catch(Exception e){
			return e.toString();
		}
		
	}

	@Override
	public String updateStudent(Students st) {
		Students stu = findStudent(st.getRollno());
		if(stu !=null) {
			stu.setStudent(st);
			return "updated student with roll no "+stu.getRollno();
		}
		
		return "no such student found";
	}

	@Override
	public String deleteStudent(int id) {
		
		Students stu = findStudent(id);
		if(stu !=null) {
			listofStudents.remove(stu);
			return "roll no "+ id + " is removed";
		}
		
		return "no such student found";
	}

	

}
