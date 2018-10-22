package com.bank.getAccDetails.service;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bank.getAccDetails.pojo.BankAccount;

@Repository
public interface Repo extends MongoRepository<BankAccount, Integer> {

	public BankAccount findByAccountNo(int accNo);
	}

