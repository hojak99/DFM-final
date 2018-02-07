package com.dpm.app.schedule;

import java.util.List;

public interface ScheduleService {
	List<ScheduleDto> getAllSchedules();
	List<ScheduleDto> getSchedulesByDate(String dateString);
	void deleteAllSchedules();
	void deleteSchedule(int id);
	void deleteSchedulesByDate(String dateString);
	void modifySchedule(ScheduleDto schedule);
}
