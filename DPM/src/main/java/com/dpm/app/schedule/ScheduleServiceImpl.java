package com.dpm.app.schedule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ScheduleServiceImpl implements ScheduleService {
	@Autowired
	private ScheduleDao scheduleDao;
	
	@Override
	public List<ScheduleDto> getAllSchedules() {
		return scheduleDao.getAllSchedules();
	}
	@Override
	public List<ScheduleDto> getSchedulesByDate(String dateString) {
		// TODO Auto-generated method stub
		return scheduleDao.getSchedulesByDate(dateString);
	}
}
