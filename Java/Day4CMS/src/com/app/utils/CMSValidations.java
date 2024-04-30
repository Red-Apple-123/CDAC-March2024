package com.app.utils;

import java.time.LocalDate;

import com.app.cms.CustMgmtSys;
import com.app.cms.Splans;
import com.app.custom_exception.CMSException;

public class CMSValidations {

	//public public static method to validate all inputs
	public static CustMgmtSys validateInputs(String fName, String lName, String password, 
			double regAmount, String dob, String plan, String email, CustMgmtSys[] custarr) throws CMSException {
		Splans splan=parseandValidateSplans(plan);
		LocalDate date=parseandValidatedob(dob);
		validateDupEmail(email,custarr);
		return new CustMgmtSys(fName, lName, password, regAmount, date, splan, email);
	}
	
	//parse and validate Splans
	public static Splans parseandValidateSplans(String splan) {
		return Splans.valueOf(splan.toUpperCase());
	}
	//parse and validate dob(String--->LocalDate)
	public static LocalDate parseandValidatedob(String Dob) {
		return LocalDate.parse(Dob);
	}
	
	//validate email
	public static void validateDupEmail(String em, CustMgmtSys[] custarr) throws CMSException{
		CustMgmtSys cu=new CustMgmtSys(em);
		for(CustMgmtSys c: custarr) {
			if(c!=null && c.equals(cu)) {
				throw new CMSException("Two emails are same.....!!");
			}
		}
	}

	
}
