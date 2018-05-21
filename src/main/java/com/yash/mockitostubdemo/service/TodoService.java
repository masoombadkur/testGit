package com.yash.mockitostubdemo.service;

import java.util.List;

import com.yash.mockitostubdemo.model.Todo;

public interface TodoService {

	List<Todo> listTrainingRelatedTodos(String searchWord);

}
