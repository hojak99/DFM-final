package com.dpm.app.moneybook.dao;

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
	
	public List<MoneyBookDTO> getMoneyBook(String dateString) {
		return sqlSession.selectList(NAMESPACE + "getMoneyBook", dateString);
	}
	
	public void writeMoneyBook(MoneyBookDTO moneyBook) {
		sqlSession.insert(NAMESPACE + "writeMoneyBook", moneyBook);
	}
	
	public void deleteAllMoneyBooks() {
		sqlSession.delete(NAMESPACE + "deleteAllMoneyBooks");
	}
	
	public void modifyMoneyBook(MoneyBookDTO moneyBook) {
		sqlSession.update(NAMESPACE + "modifyMoneyBook", moneyBook);
	}
}
