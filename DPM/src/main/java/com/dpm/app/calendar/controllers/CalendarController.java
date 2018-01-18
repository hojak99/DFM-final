package com.dpm.app.calendar.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Ä¶¸°´õ °ü·Ã Controller
 * @author KwonJH
 *
 */
@Controller
public class CalendarController {

	private static final Logger logger = LoggerFactory.getLogger(CalendarController.class);
	
	@ResponseBody
	@RequestMapping(value="/calendar", method=RequestMethod.GET)
	public String calendarHome(HttpServletRequest request, HttpServletResponse response) {
		
		
		
		return "HOME";
	}
}
