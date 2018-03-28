package com.harsha.javaPractice.collections.day12;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

public class IteratorPractice {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		iteratorPractice();
//	}
	
	@Test
	public static void iteratorPractice() {
		
		ArrayList<String> courses= new ArrayList<>();
		courses.add("Selenium");
		courses.add("Java");
		courses.add("Python");
		courses.add("Dotnet");
		courses.add("AWS");
		
		Iterator<String> iterator = courses.iterator();
		
		System.out.println(courses.size());
		while (iterator.hasNext()) { // It will check the next element presence
			System.out.println(iterator.next().equalsIgnoreCase("AWS"));  //It will fetch the next element
			iterator.remove(); //It will remove the current underlying selected element
		}
		System.out.println(courses.size());
	}

}
