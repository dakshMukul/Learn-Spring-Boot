package com.springboot.jdbc.studentJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
	private static String DELETE_QUERY =
			"""
			delete from Student 
			where id = ?
		    """;
	private static String SELECT_QUERY =
			"""
			select * from Student 
			where id = ?
			
		    """;
	
	
	public void insert(Student student) {
		springJdbcTemplate.update(INSERT_QEURY, student.getId(), student.getName(), student.getCourse());
	}
	
	public void deleteById(long id) {
		springJdbcTemplate.update(DELETE_QUERY, id);
	}
	
	public Student findById(long id) {
		//resultSet -> Bean => Row Mapper
		return springJdbcTemplate.queryForObject(SELECT_QUERY,
				new BeanPropertyRowMapper<>(Student.class), id);
	}

}
