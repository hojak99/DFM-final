package com.dpm.app.moneybook.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class MoneyBookDTO {
	private int id;
	private Date date;
	private int category;
	private int isCash; // 0이면 카드, 1이면 현금
	private int isExpense; // 0이면 수입, 1이면 지출
}
