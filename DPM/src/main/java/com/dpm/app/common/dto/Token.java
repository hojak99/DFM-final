package com.dpm.app.common.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
public class Token implements Serializable{
	
	// 클라이언트에게 주는 토큰 키
	@JsonProperty("token")
	private int tokenKey;
	
	// 서버에서 가지고 있는 토큰 고유의 값
	@JsonIgnore
	private int tokenValue;
	
	
	public Token(int key, int value) {
		this.tokenKey = key;
		this.tokenValue = value;
	}

	public int getTokenKey() {
		return tokenKey;
	}


	public int getTokenValue() {
		return tokenValue;
	}

}
