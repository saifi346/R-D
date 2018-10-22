package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.pojo.BankAccount;


@Service
public class DepositService {

	@Autowired
	private Repo repo;
	
	public void deposit(int accNo, double amount)
	{
		BankAccount acc = repo.findByAccountNo(accNo);
		double balance=acc.getAccountBalance();
		balance+=amount;
		acc.setAccountBalance(balance);
		repo.save(acc);
	}
	   
	public void add(BankAccount acc)
	{
		repo.save(acc);
	}
	

	
}
