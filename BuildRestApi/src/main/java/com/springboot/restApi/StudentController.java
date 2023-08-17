package com.springboot.restApi;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@RequestMapping("/student")
	public List<Student> retriveAllSubjects(){
		return Arrays.asList(
				new Student(1, "Rohan", "AWS"),
				new Student(2, "Vicky", "Java"),
				new Student(3, "kaushal", "MySQL")
				);
	}
}
