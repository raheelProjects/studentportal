package com.StudentPortalRest.StudentPortalRest.entity;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class StudentsTest {

	@Test
	void test() {
		Students st = new Students("Jahanghir","Naseer",191,3.4,"95%","8h4hghui"); 
		System.out.println(st.toString());
		assertEquals("Students [studentName=Jahanghir, studentfatherName=Naseer, rollno=191, cgpa=3.4, attendence=95%, credintal=[191@xyz.edu.pk, 8h4hghui]]", st.toString());
	}

}
