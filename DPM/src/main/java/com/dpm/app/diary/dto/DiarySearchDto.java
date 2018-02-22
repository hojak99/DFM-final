package com.dpm.app.diary.dto;

import java.util.Date;

public class DiarySearchDto {
	private String user_id;
	private String create_date;				// 기본 20181231이 들어감 (생성, 삭제할 시 사용)
	private String create_date_start;		// 조회할 때 12월을 조회할 시 201812 값이 들어감
	private String create_date_end;			// 조회할 때 12월을 조회할 시 20181231 값이 들어감

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getCreate_date_start() {
		return create_date_start;
	}

	public void setCreate_date_start(String create_date_start) {
		this.create_date_start = create_date_start;
	}

	public String getCreate_date_end() {
		return create_date_end;
	}

	public void setCreate_date_end(String create_date_end) {
		this.create_date_end = create_date_end;
	}

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}

	@Override
	public String toString() {
		return "DiarySearchDto [user_id=" + user_id + ", create_date=" + create_date + ", create_date_start="
				+ create_date_start + ", create_date_end=" + create_date_end + "]";
	}

	
}
