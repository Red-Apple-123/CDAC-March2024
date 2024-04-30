package com.app.cms;

import java.time.LocalDate;

//Customer should be assigned system generated (auto increment) customer id : int
//Store - first name, last name email(string),password(string),
//registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)
//Unique ID - email (2 customers CAN NOT have SAME email id)
public class CustMgmtSys {
	static int custId;
	String fName, lName, password, email;
	double regAmount;
	LocalDate dob;
	Splans plan;
	
	//autoincrement custid
	
	
    public CustMgmtSys(String fName, String lName, String password, 
			double regAmount, LocalDate dob, Splans plan, String email){
		this.fName=fName;
		this.lName=lName;
		this.password=password;
		this.regAmount=regAmount;
		this.dob=dob;
		this.plan=plan;
		this.email=email;
	}

    //Overloaded Constructor-->email
    public CustMgmtSys(String email) {
    	this.email=email;
    }
    
public CustMgmtSys(String email, String password) {
		this.email=email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "CustMgmtSys [ CustId="+custId+"fName=" + fName + ", lName=" + lName + ", "
				+ "password=" + password + ", regAmount="
				+ regAmount + ", dob=" + dob + ", plan=" + plan + "]";
	}
	
	//Override equals 
	@Override
	public boolean equals(Object b) {
		System.out.println("in custmgmt's equals");
		if(b instanceof CustMgmtSys) {
			return this.email == ((CustMgmtSys)b).email;
		}
		return false;
	}
	
}
