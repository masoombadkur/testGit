package com.yash.mockitostubdemo.daoimplstub;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.yash.mockitostubdemo.daoimplstub.TodoDAO;
import com.yash.mockitostubdemo.daoimplstub.TodoDAOImplStub;
import com.yash.mockitostubdemo.model.Todo;

public class TodoDAOImplStubTest {

	@Test
	public void listTodos_ShouldReturnListOfAllTodos() {
		TodoDAO todoDAO = new TodoDAOImplStub();
		List<Todo> todos = todoDAO.listTodos();
		assertEquals(4, todos.size());
	}

}
