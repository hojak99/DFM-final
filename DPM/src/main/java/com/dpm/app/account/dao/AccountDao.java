package com.dpm.app.account.dao;

import com.dpm.app.account.dto.UserDto;

public interface AccountDao {
	
	// ·Î±×ÀÎ
	public boolean login(UserDto user);
}
