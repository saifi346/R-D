package com.bank.withdraw.controlle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.withdraw.service.withdrawService;

@RestController
public class withdrawController {

	@Autowired
	private withdrawService service;
	
	 @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	  public void updateAccountBalance(@PathVariable("id") Object id, @RequestParam("accountNo") int accNo, @RequestParam("amount") double amount) {
	    service.withdraw(accNo, amount);
	  }
	
}
