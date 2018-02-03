package com.dpm.app.todo.dto;

import java.util.Date;

public class TodoSearchDto {
	private String user_id;
	private Date create_date;
	private int id;

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "TodoSearchDto [user_id=" + user_id + ", create_date=" + create_date + ", id=" + id + "]";
	}

}
