package com.yash.mockitostubdemo.serviceimpl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.yash.mockitostubdemo.daoimplstub.TodoDAO;
import com.yash.mockitostubdemo.daoimplstub.TodoDAOImplStub;
import com.yash.mockitostubdemo.model.Todo;
import com.yash.mockitostubdemo.service.TodoService;

public class TodoServiceImplTest {

	@Test
	public void listTrainingRelatedTodos_TrainingWordGiven_ShouldReturnTrainingRelatedTodos() {
		TodoDAO todoDAO = new TodoDAOImplStub();
		TodoService todoservice = new TodoServiceImpl(todoDAO);
		List<Todo> filteredTodos = todoservice.listTrainingRelatedTodos("training");
		assertEquals(3, filteredTodos.size());		
	}

}
