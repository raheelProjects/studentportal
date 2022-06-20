package com.StudentPortalRest.StudentPortalRest.entity;

import java.util.Arrays;

final public class Teachers {
	private int teacherid;
	private String teacherName;
    private int coursecode;
    private String credintal[]=new String[2];
    
    public Teachers(int teachid,String name,int courseid,String password) {
    	teacherid = teachid;
    	teacherName = name;
    	coursecode = courseid;
    	credintal[0] = teachid+"@xyz.edu.pk";
    	credintal[1]= password;
    }

	public int getTeacherid() {
		return teacherid;
	}

	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}
	
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	
	public void setCoursecode(int coursecode) {
		this.coursecode = coursecode;
	}


	public String getTeacherName() {
		return teacherName;
	}
	

	public int getCoursecode() {
		return coursecode;
	}

	
	public String[] getCredintal() {
		return credintal;
	}

	public void setCredintal(String[] credintal) {
		this.credintal = credintal;
	}
	
	public void setTeacher(Teachers t) {
		this.credintal = t.getCredintal();
		this.teacherid = t.getTeacherid();
		this.coursecode =t.getCoursecode();
		this.teacherName=t.getTeacherName();
	}

	@Override
	public String toString() {
		return "Teachers [teacherid=" + teacherid + ", teacherName=" + teacherName + ", coursecode=" + coursecode
				+ ", credintal=" + Arrays.toString(credintal) + "]";
	}
    

}
