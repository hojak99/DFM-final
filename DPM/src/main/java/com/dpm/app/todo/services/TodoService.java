package com.dpm.app.todo.services;

import java.util.List;

import com.dpm.app.todo.dto.TodoDto;
import com.dpm.app.todo.dto.TodoSearchDto;

public interface TodoService {
	public List<TodoDto> getAllTodo(TodoSearchDto searchDto) throws Exception;

	public List<TodoDto> getTodo(TodoSearchDto searchDto) throws Exception;

	public boolean createTodo(TodoDto createDto) throws Exception;

	public void deleteTodo(TodoDto deleteDto) throws Exception;
	
	public void updateTodo(TodoDto updateDto) throws Exception;
}
