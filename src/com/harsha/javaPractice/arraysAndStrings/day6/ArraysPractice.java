package com.harsha.javaPractice.arraysAndStrings.day6;

public class ArraysPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arraysExample();
		arrayInterviewExample();
	}
	
	public static void arraysExample() {
		
		//DataType [] variableName = new DataType [limit];
		String [] itemList = new String[6];
		int [] itemPrice = {20000, 10000, 35000, 15000, 45000, 30000};
		boolean [] itemStatus = {true, false, true, true, true, false};
		
		itemList[0] = "LED Television";
		itemList[1] = "Refrigerator";
		itemList[2] = "Camera";
		itemList[3] = "Mobile";
		itemList[4] = "Laptop";
		itemList[5] = "Apple Watch";
		
		Object address [] = new Object[6];
		
		address[0] = "Flat no.1004, 34th street";
		address[1] = 22109;
		address[2] = "California";
		address[3] = 96.9876;
		address[4] = 95.9938;
		address[5] = true;
		
		for (int i=0; i<itemList.length;i++) {
			System.out.println(itemList[i]+": "+itemPrice[i]+ " and the item status is "
								+ itemStatus[i]);
			System.out.println(address[i]);
		}
		
		System.out.println("The Shipping address is as follows :"+
							address[0]+ ", "+ address[1]+ ", "+ address[2]
							+" with longitude and latitude "+ address[3] +","+ address[4]
							+ " with the residential status as :"+ address[5]);
	}
	
	public static void arrayInterviewExample() {
		
		int [] numbers = {2,9,7,10, 45, 77,67, 35, 99, 21, 78, 765, 908};
		int value = 7650;
		
		for(int i=0; i<numbers.length;i++) {
			for (int j=i+1;j<numbers.length;j++) {
				int result = numbers[i]*numbers[j];
				if(result==value) {
				System.out.println("The numbers are :"+ numbers[i]+" and "+numbers[j]);
				break;
				}
		}
			
			}
		}
		
		
		
	}


