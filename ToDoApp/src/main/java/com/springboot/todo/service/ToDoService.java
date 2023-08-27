package com.springboot.todo.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.todo.entity.Todo;

@Service
public class ToDoService {
	
	private static List<Todo> listOfTodos = new ArrayList<>();
	private static int noOfTodos = 0;

	static {
		listOfTodos.add(new Todo(++noOfTodos, "Mukul Singh", "AWS", LocalDate.now().plusYears(1), false));
		listOfTodos.add(new Todo(++noOfTodos, "Mukul Singh", "Azure", LocalDate.now().plusYears(1), false));
		listOfTodos.add(new Todo(++noOfTodos, "Mukul Singh", "React", LocalDate.now().plusYears(1), false));
	
	}
	
	public List<Todo> fetchAlltodos(){
		return listOfTodos;
	}

	public void addNewTodo(String username, String discription, LocalDate targateDate, boolean done){
		Todo todo = new Todo(++noOfTodos, username, discription, targateDate, done);
		listOfTodos.add(todo);
	}
}
