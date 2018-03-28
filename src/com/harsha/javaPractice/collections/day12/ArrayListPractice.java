package com.harsha.javaPractice.collections.day12;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class ArrayListPractice {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		arrayListExample();
//	}
	
	@Test
	public void arrayListExample() {
		
		ArrayList<String> users = new ArrayList<>();
		users.add("Mohan");
		users.add("Shruthi");
		users.add("Ramesh T");
		users.add("Ramesh");
		
		ArrayList<String> remainingUsers = new ArrayList<>();
		remainingUsers.add("Subhranshu");
		remainingUsers.add("Rakshith");
		remainingUsers.add("Harsha");
		
		
		System.out.println(users.size()); //Gives the count of values present in arraylist
		System.out.println(users.contains("Shruthi")); //Checks the value in the arraylist
		System.out.println(users.get(3)); //Get the specified value based on index
		System.out.println(users.isEmpty());//Check whether the arraylist is empty or not
		System.out.println(users.addAll(remainingUsers)); //add another collection to existing one
		System.out.println(users.size());  //Gives the count
		users.clear();
		System.out.println(users);
		System.out.println("*******************************************");
		
		
		String [] newCourses = {"Java", "Selenium"};
		//This prints the users using traditional for loop
		for (int i=0; i<users.size(); i++) {
			System.out.println(users.get(i));
		}
		
		//This checks if each value is same as 'JAVA'
		for (String var1 : users) {
			System.out.println(var1.equals("Java"));
		}
		
		System.out.println("*******************************************");
		
		for (String printUsers : users) {
			if(printUsers.equalsIgnoreCase("Harsha"))
			{
				System.out.println("Harsha found");
			}else {
				System.out.println("Harsha lost");
			}
			
		}
				
	}

}
