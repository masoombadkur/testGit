package com.yash.mockitostubdemo.daoimplstub;

import java.util.Arrays;
import java.util.List;

import com.yash.mockitostubdemo.model.Todo;

public class TodoDAOImplStub implements TodoDAO {

	public List<Todo> listTodos() {
		return Arrays.asList(new Todo("training tasks"), new Todo("training ppt"), new Todo("project tasks"),
				new Todo("training poc"));
	}

}
