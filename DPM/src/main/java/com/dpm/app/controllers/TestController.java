package com.dpm.app.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dpm.app.dto.Test;
import com.dpm.app.services.TestService;

@Controller
@RequestMapping("/test")
public class TestController {
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	@Autowired
	private TestService testService;
	
	@RequestMapping(value = "/{id}")
	public @ResponseBody Test getTest(@PathVariable int id) {
		System.out.println("Test controller");
		logger.info("TESTController IN==>" + id);
		return testService.getTest(id);
	}
}