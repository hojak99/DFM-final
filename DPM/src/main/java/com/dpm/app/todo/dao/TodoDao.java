package com.dpm.app.todo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dpm.app.todo.dto.TodoDto;
import com.dpm.app.todo.dto.TodoSearchDto;

@Repository
public class TodoDao {

	@Autowired
	SqlSession sqlSession;

	public List<TodoDto> getAllTodo(TodoSearchDto searchDto) throws Exception {
		return sqlSession.selectList("todoDao.getAllTodo", searchDto);
	}

	public List<TodoDto> getTodo(TodoSearchDto searchDto) throws Exception {
		return sqlSession.selectList("todoDao.getTodo", searchDto);
	}

	public int createTodo(TodoDto createDto) throws Exception {
		return sqlSession.insert("todoDao.createTodo", createDto);
	}

	public int deleteTodo(TodoDto deleteDto) throws Exception {
		return sqlSession.delete("todoDao.deleteTodo", deleteDto);
	}
	
	public int updateTodo(TodoDto updateDto) throws Exception {
		return sqlSession.update("todoDao.updateTodo", updateDto);
	}
}
