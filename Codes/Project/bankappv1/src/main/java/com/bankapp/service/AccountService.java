package com.bankapp.service;

import com.bankapp.dto.AccountResponseDto;
import com.bankapp.dto.UserListResponseDto;

public interface AccountService {
	public AccountResponseDto getUserByAccountNumber(Integer accountNumber);
	public UserListResponseDto getAllUsers();
	public void addUser(AccountResponseDto bankAccountUser);
}
