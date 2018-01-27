package com.dpm.app.account.dto;

/**
 * 
 * @author KwonJH
 * 캘린더와 todo 에서 공통으로 사용할 userDTO
 */
public class UserDto {
	
	private String id;
	private String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
