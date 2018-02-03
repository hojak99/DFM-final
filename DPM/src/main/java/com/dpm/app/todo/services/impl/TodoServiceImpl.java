package com.dpm.app.todo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dpm.app.todo.dao.TodoDao;
import com.dpm.app.todo.dto.TodoDto;
import com.dpm.app.todo.dto.TodoSearchDto;
import com.dpm.app.todo.services.TodoService;

@Service
public class TodoServiceImpl implements TodoService{

	@Autowired
	TodoDao todoDao;
	
	@Override
	public List<TodoDto> getAllTodo(TodoSearchDto searchDto) throws Exception {
		return todoDao.getAllTodo(searchDto);
	}

	@Override
	public List<TodoDto> getTodo(TodoSearchDto searchDto) throws Exception {
		return todoDao.getTodo(searchDto);
	}

	@Override
	public boolean createTodo(TodoDto createDto) throws Exception {
		int result = todoDao.createTodo(createDto);
		if(result == 1) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public void deleteTodo(TodoDto deleteDto) throws Exception {
		todoDao.deleteTodo(deleteDto);
	}

	@Override
	public void updateTodo(TodoDto updateDto) throws Exception {
		todoDao.updateTodo(updateDto);
	}
	
}
