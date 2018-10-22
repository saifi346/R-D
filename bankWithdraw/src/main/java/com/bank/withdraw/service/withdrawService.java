package com.bank.withdraw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.withdraw.pojo.BankAccount;

@Service
public class withdrawService {
     
	@Autowired
	private Repo repo;
	
	public void withdraw(int accNo, double amount)
	{
		BankAccount acc = repo.findByAccountNo(accNo);
		double balance=acc.getAccountBalance();
		if(amount<=balance)
		{
		balance-=amount;
		acc.setAccountBalance(balance);
		repo.save(acc);
     	}
		else 
		{
			System.out.println("u don't have enough balance");
		}
	
	}
	
	
}
