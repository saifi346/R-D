package com.bank.withdraw.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="bank")
public  class BankAccount {
    @Id
	int accountNo;
	String accountHolderName;
	double accountBalance;
	static int autoAccountNoGen;

	{
		accountNo = ++autoAccountNoGen;
	}

	public BankAccount() {

		accountHolderName = "Unknown";
		accountBalance = 0;
	}

	public BankAccount(String accountHolderName, double accountBalance) {
		super();

		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}

	public void withdraw(double amount) {
	} 

	public void deposit(double amount) {
		accountBalance += amount;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountBalance="
				+ accountBalance + "]";
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	
	
	
}
