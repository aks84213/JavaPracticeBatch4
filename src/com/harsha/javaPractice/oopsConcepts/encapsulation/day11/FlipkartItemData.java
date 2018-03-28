package com.harsha.javaPractice.oopsConcepts.encapsulation.day11;

public class FlipkartItemData {
	
	private String electronicItem = "Laptop";
	private String FurnitureItem = "Dining Set";
	private String FashionItem = "Jeans";
	private double electronicPrice = 10000.50;
	private int FurniturePrice = 12000;
	private int FashionPrice = 1000;
	
	public String getElectronicItem() {
		return electronicItem;
	}
	public void setElectronicItem(String electronicItem) {
		this.electronicItem = electronicItem;
	}
	public String getFurnitureItem() {
		return FurnitureItem;
	}
	public void setFurnitureItem(String furnitureItem) {
		FurnitureItem = furnitureItem;
	}
	public String getFashionItem() {
		return FashionItem;
	}
	public void setFashionItem(String fashionItem) {
		FashionItem = fashionItem;
	}
	public double getElectronicPrice() {
		return electronicPrice;
	}
	public void setElectronicPrice(int electronicPrice) {
		this.electronicPrice = electronicPrice;
	}
	public int getFurniturePrice() {
		return FurniturePrice;
	}
	public void setFurniturePrice(int furniturePrice) {
		FurniturePrice = furniturePrice;
	}
	public int getFashionPrice() {
		return FashionPrice;
	}
	public void setFashionPrice(int fashionPrice) {
		FashionPrice = fashionPrice;
	}

}
