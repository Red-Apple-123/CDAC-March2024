package com.app.tester;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.app.utils.PenUtils.*;
import static com.app.utils.PenValidations.*;

import com.app.pen.Pen;




public class PenApp {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = false;
			System.out.println("Enter max no of bank accounts");

			List<Pen> penlist = new ArrayList<>();
			while (!exit) {
				System.out.println("Options : 1. Add new Pen \n" + "2. Update stock of aPen \n"
						+ "3. Set discount of 20% for all the pens which are not at all sold in last 3 months \n" + 
						"4.  Remove Pens which arenever sold once listed in 9 months "+"0. Exit ");
				System.out.println("Choose an option");
				try {
					switch (sc.nextInt()) {
					case 1:
						//add new pen 
						//String brand, String inkcolor,String color, String material, int stock, 
						//String updateDate, String listingDate, double price, int discount, List<Pen> penslist
						System.out.println("Enter pen details: Brand, InkColor, Color, Material, Stock , updateDate, ListingDate, Price, Discount");
						addNewPen(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.nextDouble(),sc.nextInt(),penlist);
						System.out.println("Pen Added Sucessfully.....!!");
						break;
					case 2: 
						//Update stock of a Pen
						System.out.println("Enter Index to update stock of a pen....");
						int index=sc.nextInt();
						System.out.println("Enter updated Stock...");
						int stk = sc.nextInt();
						if(isPenEmpty(penlist)) {
							System.out.println("Pens Array is empty...!!");
						}
						else {
							updatePenStock(penlist,index, stk);
							System.out.println("Pen stock updated Successfully.......!!");
						}
						break;
					case 3:
						//Set discount of 20% for all the pens which are not at all sold in last 3 months
						System.out.println(" Enter Listing Date...");
						String listingDt = sc.next();
						if(isPenEmpty(penlist)) {
							System.out.println("Pens Array is empty...!!");
						}
						else {
						discountPens(listingDt,penlist);
						}
						break;
					case 4 :
						if(isPenEmpty(penlist)) {
							System.out.println("Pens Array is empty...!!");
						}
						else {
						System.out.println(" Enter Listing Date...");
						String listingDt1 = sc.next();
						removePens(listingDt1,penlist);
						System.out.println("Pen removed successfully...");
						}
						break;

					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println(e);
					sc.nextLine();
				}
			}
		} 

		System.out.println("main over...");

	}

}
