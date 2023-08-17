package com.springboot.restApi;

public class Student {

	private int id;
	private String studentName;
	private String Course;
	
	public Student(int id, String name, String field) {
		this.id	= id;
		this.studentName = name;
		this.Course = field;
	}

	public int getId() {
		return id;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getCourse() {
		return Course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", Course=" + Course + "]";
	}

	
	
}
