package com.saifi.bank;

public class savingAccountVer2 extends savingAccount implements Insurance{

public String getInsuranceName() {
		
		return "LIC Jeevan Beema Policy";
	}

	public double getInsuranceAmount() {
		
		return 5000;
	}

	public boolean isLifeTime() {
		
		return true;
	}
	
}
