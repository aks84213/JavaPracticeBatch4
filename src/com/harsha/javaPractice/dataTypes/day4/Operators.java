package com.harsha.javaPractice.dataTypes.day4;

import java.awt.geom.QuadCurve2D;

public class Operators {

	static int a = 10;
	static int b = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//arithmeticOperations();
		//relationalOperations();
		//logicalOperations();
		assignmentOperations();
		 
	}
	
	public static void arithmeticOperations() {
		
		int sum, difference, product, quotient, reminder, increment, decrement;
		 System.out.println(sum = a+b);
		 System.out.println(difference = a-b);
		 System.out.println(product = a*b);
		 System.out.println(quotient = a/b);
		 System.out.println(reminder = a%b);
		 increment = a++;
		 System.out.println("Incremented value is: "+ a++);
		 System.out.println(a);
		 System.out.println(a=a+1);
		 System.out.println("Decremented value is: "+ b--);
		 System.out.println(b=b-1);
	}
	
	public static void relationalOperations(){
		
		System.out.println(a==b);  //Equals
		System.out.println(a!=b);  //Not Equals
		System.out.println(a>10);	  //Greater than
		System.out.println(20<b);  //Lesser than
		System.out.println(a>=10); //Greater than or equal to
		System.out.println(20<=b); //Lesser than or equal to
		
	}
	
	public static void logicalOperations() {
		
		boolean flag1, flag2, flag3;
		flag1 = (a==b) && (a>10);   //false
		flag2 = (20<b) || (a>=10);   //true
		flag3 = !((a>=10) && (20<=b));  //false
		
		System.out.println(flag1);
		System.out.println(flag2);
		System.out.println(flag3);
	}
	
	public static void assignmentOperations() {
		
		int c = a;
		System.out.println("Value of c is :"+c);
		a+=b;   ///a=a+b
		System.out.println("Value of a is :"+a);
		a*=b; //a=a*b;
		System.out.println("Value of a is :"+a);
	}
	
	
	//Pseudo code for Logical Operators
//	public void pseudoCodeLogicalOperators() {
//		
//		launchBrowser(); //launch the browser
//		goToAmazonApplication();  //access amazon
//		loginAmazon();   //login to it
//		searchForTv("Samsung 42 inch LED TV");
//		signOut();
//		
//		void searchForTv(String searchCriteria) {
//			int count = getTotalTvCount();  //output is 40
//			String actualLabel = "Smart TV";
//							
//			for (checkForeachTv) {
//			String tvLabel = getTvDescriptionLabel();
//			hdfcOfferIsTrue();  //output is true
//			2hourDeal();  //output is true
//			if((hdfcOfferIsTrue || 2hourDeal) && !(actualLabel.equals(tvLabel))) {
//				purchaseItem();
//				System.out.println("PASS - Samsung TV with both the offers running is purchased");
//				break;
//			}else {
//				System.out.println("FAIL - Samsung TV with both the offers running is not found");
//			}
//			}
//			
//		//Output of If condition --> if(false)
//		}
////		
////		
////	}

}
