package com.aditi.todo_backend.Service;

import java.util.List;

import com.aditi.todo_backend.Model.TodoModel;
//file-3
public interface TodoService {
	TodoModel addTodo(TodoModel todo);
	List<TodoModel> getAllTodo();
}
