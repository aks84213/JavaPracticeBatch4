package com.harsha.javaPractice.oopsConcepts.interfaces.day10;

public interface PlaceOrder extends VerifyOrderDetails{
	
	public void doLogin();
	public void searchProduct(String product);
	public void addItemToCart(String product);
	public void addShippingAddress();
	public void enterPromocode();
	public void addPaymentInfo(String paymentType);
	public void doPayment();
	public void SubmitOrder();
	
	public static void signOut() {
		System.out.println("Signed out successfully");
	}
}


