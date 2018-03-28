package com.harsha.javaPractice.oopsConcepts.interfaces.day10;

public interface VerifyOrderDetails {
	
	public void goToOrderDetailsPage();
	public void compareOrderNumber();
	public void getOrderDetails();
	public void validateOrderDetails();
	public static void signOut() {
		System.out.println("Signed out successfully");
	}

}
