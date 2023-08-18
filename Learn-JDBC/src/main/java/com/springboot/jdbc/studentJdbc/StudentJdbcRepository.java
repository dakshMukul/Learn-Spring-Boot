package com.springboot.jdbc.studentJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentJdbcRepository {
	
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String INSERT_QEURY = 
			"""
			insert into student(id, name, course)
            values(?, ?, ?)
			""";
	
	public void insert(Student student) {
		springJdbcTemplate.update(INSERT_QEURY, );
	}

}
