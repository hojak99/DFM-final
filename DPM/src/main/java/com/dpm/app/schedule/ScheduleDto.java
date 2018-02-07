package com.dpm.app.schedule;

import java.sql.Date;
import java.sql.Time;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class ScheduleDto {
	private int id;
	private String userId;
	private Time promiseTime;
	private String title;
	private String location;
	private int finish;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	private Date createDate;
}


