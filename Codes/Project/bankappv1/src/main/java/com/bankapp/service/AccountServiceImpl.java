package com.bankapp.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.bankapp.dto.UserListResponseDto;
import com.bankapp.dto.AccountResponseDto;
import com.bankapp.entity.Account;
import com.bankapp.exception.AccountAlreadyExistsException;
import com.bankapp.exception.AccountNotFoundException;
import com.bankapp.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService{
	private AccountRepository accountRepository;
	@Value("${bank.ifsc}")
    private String bankIfsc;
	
	public AccountServiceImpl(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}

	
	
	@Override
	public AccountResponseDto getUserByAccountNumber(Integer accountNumber) {
		Account bankAccount = accountRepository.findById(accountNumber).orElse(null);
		if(bankAccount == null) {
			throw new AccountNotFoundException("Bank Account for account number: '" + accountNumber + "' is not found.");
		}
				
		return new AccountResponseDto(
				bankAccount.getAccountNumber(),
				bankAccount.getAccountOwnerName(),
				bankAccount.getAccountBalance(),
				bankIfsc
			);
	}

	@Override
	public UserListResponseDto getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(AccountResponseDto bankAccountUser) {
		boolean userExists = accountRepository.findById(bankAccountUser.getAccountNumber()).isPresent();
		
		if(userExists) {
			throw new AccountAlreadyExistsException("Account already exists with account number: " 
		            + bankAccountUser.getAccountNumber());
		}
		
		Account account = new Account();
        account.setAccountNumber(bankAccountUser.getAccountNumber());
        account.setAccountOwnerName(bankAccountUser.getOwnerName());
        account.setAccountBalance(bankAccountUser.getBalance());

        accountRepository.save(account);
	}

}
