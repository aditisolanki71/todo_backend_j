package com.aditi.todo_backend.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aditi.todo_backend.Model.TodoModel;
import com.aditi.todo_backend.Repository.TodoRepository;
import com.aditi.todo_backend.Service.TodoService;
//file-4
@Service
public class TodoServiceImplementation implements TodoService{

	@Autowired
	TodoRepository todorepository;
	@Override
	public TodoModel addTodo(TodoModel todo) {
		// TODO Auto-generated method stub
		return todorepository.save(todo);
	}
	@Override
	public List<TodoModel> getAllTodo() {
		// TODO Auto-generated method stub
		return todorepository.findAll();
	}
	@Override
	public TodoModel updateTodo(TodoModel todo) {
		// TODO Auto-generated method stub
		return todorepository.save(todo);
	}
	@Override
	public void deleteTodo(int id) {
		// TODO Auto-generated method stub
		todorepository.deleteById(id);
	}
	@Override
	public TodoModel getTodoById(int id) {
		// TODO Auto-generated method stub
		Optional<TodoModel> g = todorepository.findById(id);
		return g.get();
	}
	@Override
	public void deleteAllTodo() {
		// TODO Auto-generated method stub
		todorepository.deleteAll();
	}
	
	

}
