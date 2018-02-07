package com.dpm.app.schedule;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ScheduleDao {
	private final String NAMESPACE = "com.dpm.app.mapper.ScheduleMapper.";
	@Autowired
	private SqlSessionTemplate sqlSession;

	public List<ScheduleDto> getAllSchedules() {
		return sqlSession.selectList(NAMESPACE + "getAllSchedules");
	}

	public List<ScheduleDto> getSchedulesByDate(String dateString) {
		return sqlSession.selectList(NAMESPACE + "getSchedulesByDate", dateString);
	}

	public void deleteAllSchedules() {
		sqlSession.delete(NAMESPACE + "deleteAllSchedules");
	}

	public void deleteSchedule(int id) {
		sqlSession.delete(NAMESPACE + "deleteSchedule", id);
	}

	public void deleteSchedulesByDate(String dateString) {
		sqlSession.delete(NAMESPACE + "deleteSchedulesByDate", dateString);
	}

	public void modifySchedule(ScheduleDto schedule) {
		sqlSession.update(NAMESPACE + "modifySchedule", schedule);
	}
}
