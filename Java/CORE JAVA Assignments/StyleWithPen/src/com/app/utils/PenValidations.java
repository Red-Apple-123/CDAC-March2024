package com.app.utils;

import java.time.LocalDate;
import java.util.List;

import com.app.custom_exceptions.PenException;
import com.app.pen.Brand;
import com.app.pen.Material;
import com.app.pen.Pen;

public class PenValidations {
	//method to validate all the inputs
	public static Pen validateInput(String brand, String inkcolor,String color, String material, int stock, 
			String updateDate, String listingDate, double price, int discount, List<Pen> penslist) throws PenException{
		
		Material mtr = Material.valueOf(material.toUpperCase());
		Brand bd = Brand.valueOf(brand.toUpperCase());
		LocalDate uDate= LocalDate.parse(updateDate);
		LocalDate lDate= LocalDate.parse(listingDate);	
		return new Pen(bd, color,inkcolor, mtr, stock, uDate, lDate, price,discount);
	}
	
	//isempty validation
	public static boolean isPenEmpty(List<Pen> penslist) {
		if(penslist.isEmpty()) {
			return true;
		}
		return false;
	}
	
}
