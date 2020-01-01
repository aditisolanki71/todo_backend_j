package com.aditi.todo_backend.Controller;
//file-2

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aditi.todo_backend.Model.TodoModel;
import com.aditi.todo_backend.Service.TodoService;

@RestController
@RequestMapping("todo")
public class TodoController {

	@Autowired
	TodoService todoservice;
	public TodoModel addTodo(@RequestBody TodoModel todo) {
		return todoservice.addTodo(todo);
		
	}
}
