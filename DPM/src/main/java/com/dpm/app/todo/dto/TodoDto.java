package com.dpm.app.todo.dto;

import java.util.Date;

public class TodoDto {
	private int id;
	private String tag;
	private int finish;
	private String title;
	private String user_id;
	private String create_date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public int getFinish() {
		return finish;
	}

	public void setFinish(int finish) {
		this.finish = finish;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}

	@Override
	public String toString() {
		return "TodoDto [id=" + id + ", tag=" + tag + ", finish=" + finish + ", title=" + title + ", user_id=" + user_id
				+ ", create_date=" + create_date + "]";
	}
}
