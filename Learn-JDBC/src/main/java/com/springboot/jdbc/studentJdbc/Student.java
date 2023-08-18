package com.springboot.jdbc.studentJdbc;

public class Student {

	private long id;
	private String name;
	private String course;
	
	public Student() {
		
	};
	
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
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
	
	
}
