package com.harsha.javaPractice.oopsConcepts.inheritance.day8;

public class FatherInheritance extends GrandFatherInheritance{

	
	public void fatherProperty1(String name) {
		System.out.println("This is my father property of name :"+name);
	}
	
	public void fatherProperty2(String name, String property) {
		System.out.println("This is my father property of name :"+name+" and "
				+property);
	}
	
	public void fatherProperty3(String name, String property, int value) {
		System.out.println("This is my father property of name :"+name+" and "
				+property+ " with "+value);
	}
	
	


}
