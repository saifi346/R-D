package com.bank.getAccDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.getAccDetails.pojo.BankAccount;
import com.bank.getAccDetails.service.service;

@RestController
public class controller {

	@Autowired
	private service serv;
	
	@GetMapping(value="/get/")
	public BankAccount get(@RequestParam("accNo") int accNo) {
		return serv.getBankAccount(accNo);
	}
	
	@GetMapping(value="/get/balance/")
	public double getBalance(@RequestParam("accNo") int accNo) {
		return serv.getBankBalance(accNo);
	}
	
	@GetMapping(value="/get")
	public List<BankAccount> getAll() {
		return serv.getAll();
	}
	
}
