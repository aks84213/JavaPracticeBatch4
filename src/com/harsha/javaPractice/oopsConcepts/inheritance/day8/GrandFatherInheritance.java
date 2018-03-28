package com.harsha.javaPractice.oopsConcepts.inheritance.day8;

import com.harsha.javaPractice.dataTypes.day4.Operators;

public class GrandFatherInheritance extends Operators{
	
	public static void main(String[] args) {
		grandfatherProperty1();
	}
	
	String propertyName = "Villa";
	String propertyValue = "1000000";
	String propertyType = "House";


	public static void grandfatherProperty1() {
		System.out.println("This is my grandfather property");
	}
	
	public void gfProperty2(String name) {
		System.out.println("This is my grandfather property of name :"+name);
	}
	
	public void gfProperty3(String name, String property) {
		System.out.println("This is my grandfather property of name :"+name+" and "
				+property);
	}
	
	public void gfProperty4(String name, String property, int value) {
		System.out.println("This is my grandfather property of name :"+name+" and "
				+property+ " with "+value);
	}

}
