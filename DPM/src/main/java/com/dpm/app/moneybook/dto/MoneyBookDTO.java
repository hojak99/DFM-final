package com.dpm.app.moneybook.dto;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class MoneyBookDTO {
	private int id;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	private Date date;
	private int category;
	private String content;
	private int isCash; // 0�̸� ī��, 1�̸� ����
	private int isExpense; // 0�̸� ����, 1�̸� ����
}
