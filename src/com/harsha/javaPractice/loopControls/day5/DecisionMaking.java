package com.harsha.javaPractice.loopControls.day5;

public class DecisionMaking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//nestedIfStatement();
		//nestedIfExample();
		//SimpleCalculator(50, 30, "SquareRoot");
		ifElseifExample();
	}
	
	public static void nestedIfStatement() {
		
		int currentTime = 30;
		int dealStartTime = 24;
		boolean freeGiftOffer = false;
		
		if(currentTime>dealStartTime) {
			System.out.println("Deal has started");
		}if(freeGiftOffer) {
				System.out.println("Purchase the item with offer");
			}
		
		if(dealStartTime>20) {
			System.out.println("Deal has ended because the time got lapsed");
			if(freeGiftOffer) {
				System.out.println("Deal has ended but still offer is valid");
			}
		}
		if(dealStartTime>20 && freeGiftOffer) {
			System.out.println("Deal has ended because the time got lapsed");
			System.out.println("Deal has ended but still offer is valid");
		}
		
		
		
		}
	
	public static void SimpleCalculator(int num1, int num2, String operation) {
		int result;
		switch (operation) {
		case "Add":
			result=num1+num2;
			System.out.println("The sum of the numbers is :"+result);
			break;
		case "Subtract":
			result=num1-num2;
			System.out.println("The difference of the numbers is :"+result);
			break;
		case "Product":
			result=num1*num2;
			System.out.println("The product of the numbers is :"+result);
			break;
		case "Division":
			result=num1/num2;
			System.out.println("The quotient of the numbers is :"+result);
			break;
		case "Modulus":
			result=num1%num2;
			System.out.println("The reminder of the numbers is :"+result);
			break;
			
		default:
			System.out.println("The provided operation is not allowed");
			break;
		}
	}
	
	public static void nestedIfExample() {
		int currentTime = 30;
		if(currentTime<35) {
			if(currentTime==40) {
				if(currentTime!=28) {
					System.out.println("The validation for current time is completed");
				}
			}
		}
	}
	
	public static void ifElseifExample() {
		
		boolean phoneStatusOverOnline = false;
		int phoneCost = 15000;
		boolean availabilityToBangalore = false;
		
		if(phoneStatusOverOnline) {
			System.out.println("Phone is available for purchase through Online");
		}else if(availabilityToBangalore) {
			System.out.println("Phone is available to purchse in Bangalore");	
			}else if(phoneCost<12000) {
				System.out.println("Phone is cheaper and is available");
		}else {
			System.out.println("Phone cannot be purchased as its not available anywhere");
		}
	}
	}


