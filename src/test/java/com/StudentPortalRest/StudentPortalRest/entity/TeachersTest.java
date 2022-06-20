package com.StudentPortalRest.StudentPortalRest.entity;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class TeachersTest {

	@Test
	void test() {
		Teachers teach = new Teachers(36,"Sir abrar",45,"hs89h4n");
		assertEquals("Teachers [teacherid=36, teacherName=Sir abrar, coursecode=45, credintal=[36@xyz.edu.pk, hs89h4n]]", teach.toString());
		teach.setCoursecode(43);
		assertEquals(43,teach.getCoursecode());
	}

}
