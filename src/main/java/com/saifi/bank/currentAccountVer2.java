package com.saifi.bank;

public class currentAccountVer2 extends currentAccount implements Insurance{

public String getInsuranceName() {
		
		return "Muthoot Finance";
	}

	public double getInsuranceAmount() {
		
		return 15000;
	}

	public boolean isLifeTime() {
		
		return false;
	}
	
}
