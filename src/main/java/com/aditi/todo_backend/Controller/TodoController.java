package com.aditi.todo_backend.Controller;
//file-2

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aditi.todo_backend.Model.TodoModel;
import com.aditi.todo_backend.Service.TodoService;

@RestController
@RequestMapping("/todo")
public class TodoController {

	@Autowired
	TodoService todoservice;
	
	@PostMapping
	public TodoModel addTodo(@RequestBody TodoModel todo) {
		return todoservice.addTodo(todo);
		
	}
	
	@GetMapping
	public List<TodoModel> getAllTodo() {
		return todoservice.getAllTodo();
		
	}
	
	@GetMapping("/{id}")
	public TodoModel getTodoById(@PathVariable int id) {
		return todoservice.getTodoById(id);
		
	}
	
	@PutMapping()
	public TodoModel updateTodo(@RequestBody TodoModel todo)
	{
		return todoservice.updateTodo(todo);
	}
	
	@DeleteMapping("/{id}")
	public void deleteTodo(@PathVariable int id) {
		todoservice.deleteTodo(id);
	}
	
	@DeleteMapping()
	public void deleteAllTodo() {
		todoservice.deleteAllTodo();
	}
}
