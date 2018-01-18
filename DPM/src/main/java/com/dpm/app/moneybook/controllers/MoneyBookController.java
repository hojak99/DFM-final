package com.dpm.app.moneybook.controllers;

import java.sql.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dpm.app.moneybook.dto.MoneyBookDTO;
import com.dpm.app.moneybook.services.MoneyBookService;

@Controller
@RequestMapping("/moneybook")
public class MoneyBookController {
	private static final Logger logger = LoggerFactory.getLogger(MoneyBookController.class);
	@Autowired
	private MoneyBookService moneyBookService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public @ResponseBody List<MoneyBookDTO> getAllMoneyBooks() {
		logger.info("MONEYBOOK CONTROLLER IN=>>");
		return moneyBookService.getAllMoneyBooks();
	}
	
//	@RequestMapping(value = "", method = RequestMethod.GET)
//	public @ResponseBody MoneyBookDTO getMoneyBook(@RequestParam("date")Date date) {
//		logger.info("MONEYBOOK CONTROLLER IN=>>");
//		
//		return moneyBookService.getMoneyBook(date);
//	}
	
	@RequestMapping(value = "", method = RequestMethod.DELETE)
	public void deleteAllMoneyBooks() {
		logger.info("MONEYBOOK CONTROLLER IN=>>");
		moneyBookService.deleteAllMoneyBooks();
	}

	@RequestMapping(value ="", method = RequestMethod.PUT)
	public void modifyMoneyBook(@RequestBody final MoneyBookDTO moneyBook) {
		logger.info("MONEYBOOK CONTROLLER IN=>>");
		System.out.println(moneyBook);
		moneyBookService.modifyMoneyBook(moneyBook);
	}
}
