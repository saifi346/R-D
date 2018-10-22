package com.bank.getAccDetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.getAccDetails.pojo.BankAccount;

@Service
public class service {

	 @Autowired
	 private Repo repo;
	 
	 public BankAccount getBankAccount(int accNo) {
			return repo.findByAccountNo(accNo);
		}

		public List<BankAccount> getAll() {
			return repo.findAll();
		}

		public double getBankBalance(int accNo) {
			return repo.findByAccountNo(accNo).getAccountBalance();
		}
}
