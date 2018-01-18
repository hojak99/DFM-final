package com.dpm.app.account.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.dpm.app.account.dao.AccountDao;
import com.dpm.app.account.dto.UserDto;

public class AccountDaoImpl implements AccountDao{

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public boolean login(UserDto user) {
		String id = sqlSession.selectOne("account.login", user);
		
		if(id == null) {
			return false;
		}else {
			return true;
		}
	}
	
}
