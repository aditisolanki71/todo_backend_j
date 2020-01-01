package com.aditi.todo_backend.Model;

public class TodoModel {

	int id;
	String title;
	String description;
	String action;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	@Override
	public String toString() {
		return "TodoModel [id=" + id + ", title=" + title + ", description=" + description + ", action=" + action + "]";
	}
}
