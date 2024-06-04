package com.app.pen;

import java.time.LocalDate;

public class Pen {
	
	private int id;
	private static int idGenerator;
	private Brand brand;
	private String color;
	private String inkColor;
	private Material material;
	private int stock;
	private LocalDate updateDate;
	private LocalDate listingDate;
	private double price;
	private int discount;
	public Pen(Brand brand, String color, String inkColor, Material material, int stock, LocalDate updateDate,
			LocalDate listingDate, double price, int discount) {
		super();
		this.brand = brand;
		this.color = color;
		this.inkColor = inkColor;
		this.material = material;
		this.stock = stock;
		this.updateDate = updateDate;
		this.listingDate = listingDate;
		this.price = price;
		this.discount = discount;
		this.id=++idGenerator;
	}
	public static int getIdGenerator() {
		return idGenerator;
	}
	public static void setIdGenerator(int idGenerator) {
		Pen.idGenerator = idGenerator;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getInkColor() {
		return inkColor;
	}
	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public LocalDate getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}
	public LocalDate getListingDate() {
		return listingDate;
	}
	public void setListingDate(LocalDate listingDate) {
		this.listingDate = listingDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Pen [brand=" + brand + ", color=" + color + ", inkColor=" + inkColor + ", material=" + material
				+ ", Stock=" + stock + ", updateDate=" + updateDate + ", listingDate=" + listingDate + ", price="
				+ price + ", discount=" + discount + "]";
	}
	
	
	
	
	
}
