package com.springboot.jdbc.studentJdbc;

public class Student {

	private long id;
	private String name;
	private String course;
	
	public Student() {
		
	}
	
	public Student(long id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public String getCourse() {
		return course;
	}
	
	
	
	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
	
	
}
