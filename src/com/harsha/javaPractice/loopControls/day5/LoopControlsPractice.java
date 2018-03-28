package com.harsha.javaPractice.loopControls.day5;

public class LoopControlsPractice {
	
	static int dealStartTime = 5;  //time at which deal starts
	static int currentTime = 1;    // current system time
	String item = "IPhone";
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//whileLoop();
		//whileLoopExample();
		forLoopExample();
		//forLoop();
		//doWhileLoopExample();
		//doWhileLoop();
	}
	
	public static void whileLoop() throws InterruptedException {
		
		while (!(currentTime==dealStartTime)) {
			System.out.println("********************************************************************");
			System.out.println("Current Time is not equal to Deal start time "
								+ "and current time is: "+ currentTime);
			System.out.println("Deal Start time has not reached and deal is not open");
			Thread.sleep(5000);
			currentTime++;
			System.out.println("Current time is :"+ currentTime+ " hours");
			System.out.println("********************************************************************");

		}
		System.out.println("Iphone purchased at the "+currentTime+" hours which"
							+ " is equal to deal start Time: "+dealStartTime+" hours");
		
	}
	
	public static void whileLoopExample() {
		
		int a = 1;    //value of a =1
		
		while (a<=20) { //it will check the value of a whether its less than or equal to 20
			System.out.println("The number is :"+ a);   //Print the value of a
			a++;   //increment the value of a
		}
	}
	
	public static void forLoopExample(){
		String [] tvList = {"Samsung 42 inch LCD TV", "Samsung 49 inch 4k TV", "Samsung 59 inch curved TV", 
				"Samsung 42 inch Samrt TV", "Samsung 42 inch LED TV"};  //Application search result
		
		int tvListCount = tvList.length;  //value of tvListCount = 5
		
		for (int i=0; i<tvListCount;i++) {
			String tvName = "Samsung 59 inch curved TV";
			if(tvName.equals(tvList[i])){
				System.out.println("PASS -- Purchased the TV with name "+tvName+"");
				break;
			}else {
				System.out.println("FAIL -- Tv name "+tvName+" is not found");
			}
		
		}
		
	}
	
	public static void forLoop() {
		int a;
		for (a=1;a<=40;a++) {
			System.out.println("The number is :"+ a);
		}
		System.out.println("*********************************************");

		
		for (a=100;a>=80;a--) {
			System.out.println("The number is :"+ a);
		}
		
	}
	
	public static void doWhileLoopExample() {
		
		int offerTime = 10;
		int dealStartTime = 0;
		int purchaseTimes = 1;
		
		
		do {
			if(offerTime>0) {
			System.out.println("PASS -- Purchased RedMi phone for "+purchaseTimes+"");
			purchaseTimes++;
			dealStartTime++;
			offerTime--;
			}else {
			System.out.println("FAIL -- Deal has ended and you cannot purchase");
			}
		}while(offerTime!=0);
		
	}
	
	public static void doWhileLoop() {
		 int x =50;
		 do {
			 System.out.println("The number is :"+x);
			 x++;
		 }while (x<=60);
	}
	
	

}
