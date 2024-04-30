package com.app.cms;

public enum Splans {
	SILVER(1000), GOLD(2000), DIAMOND(5000), PLATINUM(10000);
	
	private double charges;
	
	//Constructor
	Splans(double charges){
		this.charges=charges;
	}
	
	@Override
	public String toString() {
		return "Charges: " + charges;
	}
	
	public double getCharges() {
		return charges;
	}
}
