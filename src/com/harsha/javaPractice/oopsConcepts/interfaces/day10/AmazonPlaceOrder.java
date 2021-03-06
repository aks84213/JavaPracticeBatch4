package com.harsha.javaPractice.oopsConcepts.interfaces.day10;

import com.harsha.javaPractice.oopsConcepts.inheritance.day8.FatherInheritance;

public class AmazonPlaceOrder extends FatherInheritance implements PlaceOrder{

	@Override
	public void doLogin() {
		System.out.println("Logged in to Amazon Successfully");
	}
	
	@Override
	public void searchProduct(String product) {
		System.out.println("Searched "+product+" product");
		
	}

	@Override
	public void addItemToCart(String product) {
		System.out.println("Added "+product+" to cart");
		
	}

	@Override
	public void addShippingAddress() {
		System.out.println("Added bangalore shipping address");
		
	}

	@Override
	public void addPaymentInfo(String paymentType) {
		System.out.println("Added "+paymentType+" payment info");
		
	}

	@Override
	public void doPayment() {
		System.out.println("Payment is done successfully");
		
	}

	@Override
	public void SubmitOrder() {
		System.out.println("Order submit is done and placed the order");
		
	}

	@Override
	public void goToOrderDetailsPage() {
		System.out.println("Order details page displayed successfully for amazon");
		
	}

	@Override
	public void compareOrderNumber() {
		System.out.println("Order Number matched");
		
	}

	@Override
	public void getOrderDetails() {
		System.out.println("Order details fetched successfully for amazon");
		
	}

	@Override
	public void validateOrderDetails() {
		System.out.println("Order details matched");
		
	}
	

	
	public void placeAmazonOrder(String product, String paymentType) {
		this.doLogin();
		System.out.println("Wait for 5 seconds");
		this.searchProduct(product);
		this.addItemToCart(product);
		this.addShippingAddress();
		this.enterPromocode();
		this.addPaymentInfo(paymentType);
		this.doPayment();
		this.SubmitOrder();
		
		this.goToOrderDetailsPage();
		this.compareOrderNumber();
		this.getOrderDetails();
		this.validateOrderDetails();
	}
	
	public void validateAmazonOrderDetails() {
		this.doLogin();
		this.goToOrderDetailsPage();
		this.compareOrderNumber();
		this.getOrderDetails();
		this.validateOrderDetails();
	}

	@Override
	public void enterPromocode() {
		System.out.println("Promocode entered in Amazon");
		
	}

	
}
