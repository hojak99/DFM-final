package com.dpm.app.moneybook.services;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dpm.app.moneybook.dao.MoneyBookDao;
import com.dpm.app.moneybook.dto.MoneyBookDTO;

@Service
@Transactional
public class MoneyBookServiceImpl implements MoneyBookService {
	@Autowired
	private MoneyBookDao moneyBookDao;

	@Override
	public List<MoneyBookDTO> getAllMoneyBooks() {
		return moneyBookDao.getAllMoneyBooks();
	}

	@Override
	public MoneyBookDTO getMoneyBook(Date date) {
		return moneyBookDao.getMoneyBook(date);
	}

	@Override
	public void deleteAllMoneyBooks() {
		moneyBookDao.deleteAllMoneyBooks();
	}
}
