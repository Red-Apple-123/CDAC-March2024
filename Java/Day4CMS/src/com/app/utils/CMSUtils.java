package com.app.utils;


import java.util.Scanner;


import com.app.cms.CustMgmtSys;

import com.app.custom_exception.CMSException;

public class CMSUtils {



	
	//Sign Up
	public static void signUp(CustMgmtSys[] custarr, int count) throws CMSException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Cutomer details:[FirstName, LastName, Passsword, regAmount, DOB, PlanType ,Email]");
		if(count < custarr.length) {
		CustMgmtSys ct =  CMSValidations.validateInputs(sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next(),sc.next(), custarr);
		custarr[count++]=ct;
		System.out.println("A/C is created.....");
		System.out.println("Customer Details....");
		System.out.println(ct.toString());
		}
		else {
			System.out.println("Capacity is Full.....");
		}
		//throw new CMSException("Enter valid details....");
	}
	
	
	//Sign in (login)	
	public static void signIn(String email, String password, CustMgmtSys[] ar) throws CMSException{
		CustMgmtSys arr = new CustMgmtSys(email,password);
		for(CustMgmtSys m: ar) {
			if(m!=null && m.equals(arr)) {
				System.out.println("Successfully Logged in..");
			}
			throw new CMSException("Invalid Email or Password...");
		}
		
	}
	
	

}
