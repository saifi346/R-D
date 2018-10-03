package com.saifi.cust;


import com.saifi.bank.Insurance;

import com.saifi.bank.currentAccountVer2;

import com.saifi.bank.savingAccountVer2;

public class Customer {
    
	public static void main(String[] args) {
		Insurance acc=null;
		acc=new savingAccountVer2();
		System.out.println("amount: "+ acc.getInsuranceAmount() + " Company Name:  " +acc.getInsuranceName()+"  isLifeTime: "+acc.isLifeTime());
        
		
		
		Insurance current=null;
		current=new currentAccountVer2();
		System.out.println("amount: " + current.getInsuranceAmount() + " Company Name:  " +current.getInsuranceName()+"  isLifeTime: "+current.isLifeTime());

		
		
	}
	
}
