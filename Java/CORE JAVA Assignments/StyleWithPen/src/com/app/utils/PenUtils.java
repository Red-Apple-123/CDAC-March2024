package com.app.utils;

import com.app.custom_exceptions.PenException;
import com.app.pen.Pen;
import static com.app.utils.PenValidations.validateInput;

import java.time.LocalDate;
import java.time.Period;
import java.util.Iterator;
import java.util.List;



public class PenUtils {

	public static void addNewPen(String brand, String inkcolor,String color, String material, int stock, 
			String updateDate, String listingDate, double price, int discount, List<Pen> penslist) throws PenException{
		Pen pen = validateInput(brand, inkcolor, color, material, stock, updateDate, listingDate, price, discount,penslist);
		penslist.add(pen);	
	}

	public static void updatePenStock(List<Pen> penslist, int index, int stock) {
		Pen pen =penslist.get(index);
		pen.setStock(stock);
	}

	//Set discount of 20% for all the pens which are not at all sold in last 3 months
	public static void discountPens(String listingDate, List<Pen> penlist) {
		Period diff = Period.between(LocalDate.now(), LocalDate.parse(listingDate));
		int months= diff.getMonths();
		if(months>3) {
			for(Pen pen: penlist) {
				pen.setDiscount(20);
			}
		}

	}


	//Remove Pens which are never sold once listed in 9 months
	public static void removePens(String listingDate,List<Pen> penlist) {
		Period diff = Period.between(LocalDate.now(), LocalDate.parse(listingDate));
		int months= diff.getMonths();
		Iterator<Pen> itr = penlist.iterator();
		if(months>9) {
			if(itr.next().getListingDate() == LocalDate.parse(listingDate)) {
				itr.remove();
			}
		}
	}

}
