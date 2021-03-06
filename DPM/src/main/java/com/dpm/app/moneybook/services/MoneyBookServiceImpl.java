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
	public List<MoneyBookDTO> getMoneyBook(String dateString) {
		return moneyBookDao.getMoneyBook(dateString);
	}

	@Override
	public void writeMoneyBook(MoneyBookDTO moneyBook) {
		moneyBookDao.writeMoneyBook(moneyBook);
	}
	
	@Override
	public void deleteAllMoneyBooks() {
		moneyBookDao.deleteAllMoneyBooks();
	}
	
	@Override
	public void deleteMoneyBook(int id) {
		moneyBookDao.deleteMoneyBook(id);
	}
	
	@Override
	public void deleteMoneyBookByDate(String dateString) {
		moneyBookDao.deleteMoneyBookByDate(dateString);
	}

	@Override
	public void modifyMoneyBook(MoneyBookDTO moneyBook) {
		moneyBookDao.modifyMoneyBook(moneyBook);
	}
}
