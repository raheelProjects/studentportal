package com.StudentPortalRest.StudentPortalRest.entity;

import java.util.Arrays;

final public class Students{
    private String studentName;
    private String studentfatherName;
    private int rollno;
    private double cgpa;
    private String attendence;
    private String credintal[]=new String[2];
    
    public Students(String name,String fname,int rol,double cg,String at,String password){
        this.studentName = name;
        this.studentfatherName =fname;
        this.rollno=rol;
        this.cgpa=cg;
        this.attendence =at;
        this.credintal[0]=this.rollno+"@xyz.edu.pk";
        this.credintal[1]=password;
    }

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentfatherName() {
		return studentfatherName;
	}

	public void setStudentfatherName(String studentfatherName) {
		this.studentfatherName = studentfatherName;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public String getAttendence() {
		return attendence;
	}

	public void setAttendence(String attendence) {
		this.attendence = attendence;
	}

	public String[] getCredintal() {
		return credintal;
	}

	public void setCredintal(String[] credintal) {
		this.credintal = credintal;
	}
	
	public void setStudent(Students st) {
		this.credintal = st.getCredintal();
		this.attendence = st.getAttendence();
		this.cgpa = st.getCgpa();
		this.studentfatherName = st.getStudentfatherName();
		this.studentName = st.getStudentName();
	}

	@Override
	public String toString() {
		return "Students [studentName=" + studentName + ", studentfatherName=" + studentfatherName + ", rollno="
				+ rollno + ", cgpa=" + cgpa + ", attendence=" + attendence + ", credintal=" + Arrays.toString(credintal)
				+ "]";
	}
    
    
}

