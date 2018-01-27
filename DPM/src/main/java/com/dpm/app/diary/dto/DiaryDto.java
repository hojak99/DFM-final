package com.dpm.app.diary.dto;

import java.util.Date;

public class DiaryDto {
	private int id;
	private String title;
	private String content;
	private Date create_date;
	private String user_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "DiaryDto [id=" + id + ", title=" + title + ", content=" + content + ", create_date=" + create_date
				+ ", user_id=" + user_id + "]";
	}

}
