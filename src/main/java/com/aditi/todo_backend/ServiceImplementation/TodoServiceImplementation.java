package com.aditi.todo_backend.ServiceImplementation;

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

}
