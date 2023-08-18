package com.springboot.jdbc.studentJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StudentJdbcCommandLineRunner implements CommandLineRunner{

	@Autowired
	private StudentJdbcRepository studentJdbcRepository;
	
	@Override
	public void run(String... args) throws Exception {
		studentJdbcRepository.insert();
		
	}

}
