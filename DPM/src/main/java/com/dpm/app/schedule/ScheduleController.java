package com.dpm.app.schedule;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/schedule")
public class ScheduleController {
	private static final Logger logger = LoggerFactory.getLogger(ScheduleController.class);
	@Autowired
	private ScheduleService scheduleService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody List<ScheduleDto> getAllSchedules() {
		logger.info("getAllSchedule =>>");
		return scheduleService.getAllSchedules();
	}

	@RequestMapping(value = "/{dateString}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody List<ScheduleDto> getSchedulesByDate(
			@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) String dateString) {
		logger.info("getSchedules = >>");
		return scheduleService.getSchedulesByDate(dateString);
	}
}
