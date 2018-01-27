package com.dpm.app.calendar.controllers;

import java.util.List;

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

/**
 * Ķ���� ���� Controller
 * @author KwonJH
 *
 */
@Controller
public class CalendarController {

	private static final Logger logger = LoggerFactory.getLogger(CalendarController.class);
	
	@Autowired
	DiaryService diaryService;
	
	@ResponseBody
	@RequestMapping(value="/calendar", method=RequestMethod.GET)
	public String calendarHome(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		DiarySearchDto searchDto = new DiarySearchDto();
		searchDto.setUser_id("test");
		List<DiaryDto> diaryList = diaryService.getAllDiary(searchDto);
		
		return "HOME";
	}
}
