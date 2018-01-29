package com.dpm.app.moneybook.services;

import java.sql.Date;
import java.util.List;

import com.dpm.app.moneybook.dto.MoneyBookDTO;


public interface MoneyBookService {
	List<MoneyBookDTO> getAllMoneyBooks();
	List<MoneyBookDTO> getMoneyBook(String dateString);
	void writeMoneyBook(MoneyBookDTO moneyBook);
	void deleteAllMoneyBooks();
	void modifyMoneyBook(MoneyBookDTO moneyBook);
}
