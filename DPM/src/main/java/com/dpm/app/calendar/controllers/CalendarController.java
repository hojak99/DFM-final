package com.dpm.app.calendar.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dpm.app.diary.dto.DiaryDto;
import com.dpm.app.diary.dto.DiarySearchDto;
import com.dpm.app.diary.services.DiaryService;
import com.dpm.app.todo.dto.TodoDto;
import com.dpm.app.todo.dto.TodoSearchDto;
import com.dpm.app.todo.services.TodoService;

/**
 * @author KwonJH
 *
 */
@Controller
public class CalendarController {

	private static final Logger logger = LoggerFactory.getLogger(CalendarController.class);
	
	@Autowired
	DiaryService diaryService;
	
	@Autowired
	TodoService todoService;
	
	@ResponseBody
	@RequestMapping(value="/calendar", method=RequestMethod.GET)
	public Map<String, Object> calendarHome(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Date date = new Date();
		SimpleDateFormat ymdFormat = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat ymFormat = new SimpleDateFormat("yyyyMM");
		SimpleDateFormat yFormat = new SimpleDateFormat("yyyy");
		
		Map<String, Object> jsonObject = new HashMap<String, Object>();
		
		TodoSearchDto todoSearchDto = new TodoSearchDto();
		todoSearchDto.setUser_id("test");
		
		DiarySearchDto diarySearchDto = new DiarySearchDto();
		diarySearchDto.setUser_id("hojak99");
	
		Map<String, Object> jsonTodo = new HashMap<>();
		Map<String, Object> jsonDiary = new HashMap<>();
		for(int i = 1; i<13; ++i) {
			if(i < 10) {
				diarySearchDto.setCreate_date_start(yFormat.format(date)+"0"+i);
				todoSearchDto.setCreate_date_start(yFormat.format(date)+"0"+i);
			} else {
				diarySearchDto.setCreate_date_start(yFormat.format(date)+i);
				todoSearchDto.setCreate_date_start(yFormat.format(date)+i);
			}
			
			List<TodoDto> todoList = todoService.getTodo(todoSearchDto);
			List<DiaryDto> diaryList = diaryService.getDiary(diarySearchDto);
			
			if(todoList != null || todoList.size() == 0) {
				jsonDiary.put(String.valueOf(i), diaryList.toString());	
			}else {
				jsonDiary.put(String.valueOf(i), "null");
			}
			
			if(diaryList != null || diaryList.size() == 0){
				jsonTodo.put(String.valueOf(i), todoList.toString());	
			} else {
				jsonTodo.put(String.valueOf(i), "null");
			}
			
			
		}
		
		jsonObject.put("diary", jsonDiary);
		
		
		
		return "HOME";
	}
}
