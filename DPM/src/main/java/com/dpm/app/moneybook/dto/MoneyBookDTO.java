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
	private int isCash; // 0이면 카드, 1이면 현금
	private int isExpense; // 0이면 수입, 1이면 지출
}
