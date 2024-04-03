package com.sravan.spring.springcore;

public class Student {
	private String studentName;
	private String schoolName;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public void printStudnetInfo() {
		System.out.println("Student Name :: " + this.studentName);
		System.out.println("School Name :: " + this.schoolName);
	}
}
