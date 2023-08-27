package com.springboot.todo.controller;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.todo.entity.Todo;
import com.springboot.todo.service.ToDoService;

@Controller
public class todoController {

	@Autowired
	private ToDoService toDoService;

	@RequestMapping("/login")
	public String printHelloWorld() {
		return "login";
	}

	@RequestMapping("list-todos")
	public String listAllToDos(ModelMap model) {
		List<Todo> todos = toDoService.fetchAlltodos();
		model.addAttribute("todos", todos);
		return "list-todos";
	}

	@RequestMapping(value = "add-todo", method = RequestMethod.GET)
	public String showNewToDoPage() {
		return "newtodo";
	}

	@RequestMapping(value = "add-todo", method = RequestMethod.POST)
	public String addNewTodo(@RequestParam String username, @RequestParam String discription) {
		toDoService.addNewTodo(username, discription, LocalDate.now().plusYears(1), false);
		return "redirect:list-todos";
	}
}
