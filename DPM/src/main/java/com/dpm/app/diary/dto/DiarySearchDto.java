package com.dpm.app.diary.dto;

import java.util.Date;

public class DiarySearchDto {
	private String user_id;
	private Date create_date;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	@Override
	public String toString() {
		return "DiarySearchDto [user_id=" + user_id + ", create_date=" + create_date + "]";
	}

}
