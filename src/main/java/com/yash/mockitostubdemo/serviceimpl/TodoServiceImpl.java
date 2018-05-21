package com.yash.mockitostubdemo.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.yash.mockitostubdemo.daoimplstub.TodoDAO;
import com.yash.mockitostubdemo.model.Todo;
import com.yash.mockitostubdemo.service.TodoService;

public class TodoServiceImpl implements TodoService {
	
	private TodoDAO todoDAO;
	
	public TodoServiceImpl(TodoDAO todoDAO) {
		this.todoDAO = todoDAO;
	}

	public List<Todo> listTrainingRelatedTodos(String searchWord) {
		List<Todo> filteredTodos = new ArrayList<Todo>();
		List<Todo> todos = todoDAO.listTodos();
		for (Todo todo : todos) {
			if(todo.getTodoTitle().contains(searchWord)){
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}

}
