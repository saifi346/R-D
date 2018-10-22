package com.bank.controller;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.pojo.BankAccount;
import com.bank.service.DepositService;




@RestController
public class DepositController {

	@Autowired
	private DepositService depositService;
     
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public void addUser(@Valid @RequestBody BankAccount acc) {
	   depositService.add(acc);
	}
	
	 @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	  public void updateAccountBalance(@PathVariable("id") Object id, @RequestParam("accountNo") int accNo, @RequestParam("amount") double amount) {
	    depositService.deposit(accNo, amount);
	  }
	
}
