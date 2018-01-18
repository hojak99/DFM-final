package com.dpm.app.moneybook.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class MoneyBookDTO {
	private int id;
	private Date date;
	private int category;
	private int isCash; // 0�̸� ī��, 1�̸� ����
	private int isExpense; // 0�̸� ����, 1�̸� ����
}
