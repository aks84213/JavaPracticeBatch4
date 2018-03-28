package com.harsha.javaPractice.oopsConcepts.encapsulation.day11;

public class FlipkartItemsPurchaseTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		purchaseItems();
	}
	
	public static void purchaseItems() {
		
		FlipkartItemData flipkartData = new FlipkartItemData();
		System.out.println("Electronic Item "
				+flipkartData.getElectronicItem()+" is purchased");
		System.out.println("Electronic price of this item is "
				+flipkartData.getElectronicPrice()+"");
		System.out.println("*******Before setting new values*********");
		System.out.println(flipkartData.getFashionItem());
		System.out.println(flipkartData.getFashionPrice());
		
		flipkartData.setFashionItem("Casuals Shirt");
		flipkartData.setFashionPrice(2000);
		
		
		System.out.println("*******After setting new values*********");
		System.out.println(flipkartData.getFashionItem());
		System.out.println(flipkartData.getFashionPrice());
		
	}

}
