package com.dpm.app.account.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dpm.app.HomeController;
import com.dpm.app.common.dto.Token;
import com.dpm.app.common.utils.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;

@Controller
public class AccountController {
	
	private static final Logger logger = LoggerFactory.getLogger(AccountController.class);
	
	@ResponseBody
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(HttpServletRequest request, HttpServletResponse response, @RequestParam("param") String param) throws JsonProcessingException {
		
		try {
			final JSONObject jsonParam = JsonParser.parseJsonObject(param);
			final JSONObject jsonParamData = (JSONObject) jsonParam.get("data");
			
			String id = jsonParamData.get("id").toString();
			String password = jsonParamData.get("password").toString();
			
			if(request.getSession().getAttribute("token") == null) {
				logger.info("token is null");
				
			}
			
		} catch (ParseException e) {
			e.printStackTrace();
			logger.error("/login [json parse error]");
		}
		
		return "";
	}
}
