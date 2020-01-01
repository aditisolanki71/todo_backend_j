package com.aditi.todo_backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aditi.todo_backend.Model.TodoModel;
//file-5
@Repository
public interface TodoRepository extends JpaRepository<TodoModel,Integer>{

}
