package com.dpm.app.moneybook.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

	@RequestMapping(value = "/{dateString}", method = RequestMethod.GET)
	public @ResponseBody List<MoneyBookDTO> getMoneyBook(
			@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) String dateString) throws ParseException {
		logger.info("MONEYBOOK CONTROLLER IN=>>");
		return moneyBookService.getMoneyBook(dateString);
	}

	@RequestMapping(value = "", method = RequestMethod.PUT)
	public void modifyMoneyBook(@RequestBody final MoneyBookDTO moneyBook) {
		logger.info("MONEYBOOK CONTROLLER IN=>>");
		System.out.println(moneyBook);
		moneyBookService.modifyMoneyBook(moneyBook);
	}

	@RequestMapping(value = "", method = RequestMethod.DELETE)
	public void deleteAllMoneyBooks() {
		logger.info("MONEYBOOK CONTROLLER IN=>>");
		moneyBookService.deleteAllMoneyBooks();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteMoneyBook(@PathVariable int id) {
		logger.info("MONEYBOOK CONTROLLER IN=>>");
		moneyBookService.deleteMoneyBook(id);
	}
	
	@RequestMapping(value = "/date/{dateString}", method = RequestMethod.DELETE)
	public void deleteMoneyBookByDate(
			@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) String dateString) {
		logger.info("MONEYBOOK CONTROLLER IN=>>");
		moneyBookService.deleteMoneyBookByDate(dateString);
	}	
}
