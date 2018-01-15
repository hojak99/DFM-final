package com.dpm.app.dao;

import javax.naming.NameParser;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dpm.app.dto.Test;

@Repository
public class TestDao {
	private final String NAMESPACE = "com.dpm.app.mapper.TestMapper.";
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public Test getTest(int id) {
		return this.sqlSession.selectOne(NAMESPACE + "getTest", id);
	}
}
