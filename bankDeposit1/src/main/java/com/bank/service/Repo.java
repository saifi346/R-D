package com.bank.service;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bank.pojo.BankAccount;



@Repository
public interface Repo extends MongoRepository<BankAccount, Integer> {

	public BankAccount findByAccountNo(int accNo);
	}
