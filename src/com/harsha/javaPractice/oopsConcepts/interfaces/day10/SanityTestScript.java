package com.harsha.javaPractice.oopsConcepts.interfaces.day10;

public class SanityTestScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String webSite = "Snapdeal";
		String item = "Apple Ipad";
		String paymentType = "Netbanking";
		
		orderSubmit(webSite, item, paymentType);
		loginAndVerifyOrderDetails(webSite);
		
		
	}
	
	public static void orderSubmit(String webSite, String item, String paymentType) {
		
		System.out.println("***********Test Case Excecution Started***********");
		if(webSite.equalsIgnoreCase("Amazon")) {
			AmazonPlaceOrder amazon = new AmazonPlaceOrder();
			amazon.placeAmazonOrder(item, paymentType);
		}else if(webSite.equalsIgnoreCase("Flipkart")) {
			FlipkartPlaceOrder flipkart = new FlipkartPlaceOrder();
			flipkart.placeFlipkartOrder(item, paymentType);
		}else if(webSite.equalsIgnoreCase("Snapdeal")){
			SnapdealPlaceOrder snapdeal = new SnapdealPlaceOrder();
			snapdeal.placeSnapDealOrder(item, paymentType);
		}
		System.out.println("***********Test Case Excecution Ended***********");
	}
	
	public static void loginAndVerifyOrderDetails(String webSite) {
		
		System.out.println("***********Test Case Excecution Started***********");
		if(webSite.equalsIgnoreCase("Amazon")) {
			AmazonPlaceOrder amazon = new AmazonPlaceOrder();
			amazon.validateAmazonOrderDetails();
		}else if(webSite.equalsIgnoreCase("Flipkart")) {
			FlipkartPlaceOrder flipkart = new FlipkartPlaceOrder();
			flipkart.validateFlipkartOrderDetails();
		}else if(webSite.equalsIgnoreCase("Snapdeal")){
			SnapdealPlaceOrder snapdeal = new SnapdealPlaceOrder();
			snapdeal.validateSnapDealOrderDetails();
		}
		System.out.println("***********Test Case Excecution Ended***********");
	}

}
