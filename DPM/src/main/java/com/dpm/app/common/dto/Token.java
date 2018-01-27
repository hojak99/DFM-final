package com.dpm.app.common.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
public class Token implements Serializable{
	
	// Ŭ���̾�Ʈ���� �ִ� ��ū Ű
	@JsonProperty("token")
	private int tokenKey;
	
	// �������� ������ �ִ� ��ū ������ ��
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
