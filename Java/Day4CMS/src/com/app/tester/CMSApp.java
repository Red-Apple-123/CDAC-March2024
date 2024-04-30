package com.app.tester;

import java.util.Scanner;

import com.app.cms.CustMgmtSys;
import com.app.utils.CMSUtils;


public class CMSApp {

	public static void main(String[] args) {
		//try with resources block 
		try(Scanner sc= new Scanner(System.in)){
			
			System.out.println("Enter CustMgmtSys size:");
			CustMgmtSys[] custarr = new CustMgmtSys[sc.nextInt()];
			boolean exit = false;
			int count =0;
			
			while(!exit) {
				System.out.println("0. Exit" + "1. Sign Up \n" + "2. Sign In \n" + "3. Change Password \n" + 
			"4. UnSubscribe Customer \n" + "5. Display all Customer ");
				
				
				try {
					switch(sc.nextInt()) {
					
					case 1:
						CMSUtils.signUp(custarr, count);
						break;
						
					case 2:
						System.out.println("Enter email id and password: ");
						CMSUtils.signIn(sc.next(), sc.next(), custarr);
						break;
					case 3:
						break;
					case 0:
						exit = true;
						break;
					}
				}
				catch(Exception e) {
					System.out.println(e);
					sc.nextLine();//to avoid infinite loop
				}
				
				
				
			}
		}
		System.out.println("Main Over....");
	}
}
