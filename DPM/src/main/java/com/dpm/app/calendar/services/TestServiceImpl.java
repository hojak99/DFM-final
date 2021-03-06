package com.dpm.app.calendar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dpm.app.calendar.dao.TestDao;
import com.dpm.app.calendar.dto.Test;

@Service
@Transactional
public class TestServiceImpl implements TestService {
	@Autowired
	private TestDao testDao;
	
	@Override
	public Test getTest(int id) {
		return testDao.getTest(id);
	}
}
