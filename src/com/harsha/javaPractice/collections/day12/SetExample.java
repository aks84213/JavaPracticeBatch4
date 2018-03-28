package com.harsha.javaPractice.collections.day12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setPractice();
		hashSetPractice();
		//stringInterviewExample();
		//setInterviewExample();
	}
	
	public static void setPractice() {
		
		int [] validity = {2010, 2020, 2023, 2045, 2030, 2045, 2010, 2023};
		Set<Integer> uniqueValidity = new HashSet<>();
		
		System.out.println(validity.length);
		for (int year : validity) {
			uniqueValidity.add(year);	
			
		}
		System.out.println(uniqueValidity.size());
		System.out.println(uniqueValidity);
		
		System.out.println("********************************************************");
		
	}
	
	public static void hashSetPractice() {
		
		int [] validity = {2010, 2020, 2023, 2045, 2030, 2045, 2010, 2023};
		HashSet<Integer> uniqueValidity = new HashSet<>();
		
		System.out.println(validity.length);
		for (int year : validity) {
			uniqueValidity.add(year);	
			
		}
		System.out.println(uniqueValidity.size());
		System.out.println(uniqueValidity);
		
		
	}
	
	public static void stringInterviewExample() {
		
		//Check whether is there any duplicate character in the string
		String name = "sriharsha";
		char [] inputName = name.toCharArray();//[s,r,i,h,a,r,s,h,a]
		for(int i=0;i<name.length();i++) {  //it starts from 1st index i.e. 's'
			for(int j=i+1;j<name.length();j++) {  //it starts from 2nd index i.e. 'r'
				if(inputName[i]==inputName[j]) {  //comparing 1st and 2nd index
					System.out.println("The repeated character is :"+inputName[i]); //printing them if they are equal
				}
			}
		}
	}
	
	public static void setInterviewExample() {
		
		//Check whether is there any duplicate character in the string
				String name = "sriharsha";
				Set<Character> uniqueCharacter = new HashSet<>();
				char [] inputName = name.toCharArray();//[s,r,i,h,a,r,s,h,a]
				for(int i=0;i<name.length();i++) {  //it starts from 1st index i.e. 's'
					uniqueCharacter.add(inputName[i]);	
					}
				System.out.println(uniqueCharacter);
				if(inputName.length!=uniqueCharacter.size()){
					System.out.println("There are repeated characters");
				}else {
					System.out.println("There are no repeated characters");
				}
				}
	

}
