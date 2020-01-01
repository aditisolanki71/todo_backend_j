package com.aditi.todo_backend.Service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.aditi.todo_backend.Model.TodoModel;
//file-3
public interface TodoService {
	TodoModel addTodo(TodoModel todo);
	List<TodoModel> getAllTodo();
	TodoModel updateTodo(TodoModel todo);
	void deleteTodo(int id);
	TodoModel getTodoById(int id);
}
