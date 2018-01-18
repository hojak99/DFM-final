package com.dpm.app.moneybook.dao;

import java.sql.Date;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.dpm.app.moneybook.dto.MoneyBookDTO;

import org.springframework.beans.factory.annotation.Autowired;

@Repository
public class MoneyBookDao {
	private final String NAMESPACE = "com.dpm.app.mapper.MoneyBookMapper.";
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public List<MoneyBookDTO> getAllMoneyBooks() {
		return sqlSession.selectList(NAMESPACE + "getAllMoneyBooks");
	}
	
	public MoneyBookDTO getMoneyBook(Date date) {
		return sqlSession.selectOne(NAMESPACE + "getMoneyBook", date);
	}
	
	public void deleteAllMoneyBooks() {
		sqlSession.delete(NAMESPACE + "deleteAllMoneyBooks");
	}
}
