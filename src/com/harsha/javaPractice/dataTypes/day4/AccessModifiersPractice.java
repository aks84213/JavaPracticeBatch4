package com.harsha.javaPractice.dataTypes.day4;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class AccessModifiersPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nonAccessModifiers();
	}
	
	void defaultModifierMethod() {
		System.out.println("This is a default modifier method");
	}
	
	public void accessModifiers() {
		defaultModifierMethod();
		modifierPrivate();
	}
	
	private void modifierPrivate() {
		System.out.println("This method is access privately");
	}
	
	public void globallyAccessibleMethod(String name, int age, String company, 
										String employeeStatus, boolean status, long salary) {
		
		System.out.println("*******************************************************");
		System.out.println("Name of the Employee is "+name);
		System.out.println("Age of the Employee is "+age);
		System.out.println("Company of the Employee is "+company);
		System.out.println("Employement status of the Employee is "+employeeStatus);
		System.out.println("ID Activation status of the Employee is "+status);
		System.out.println("Salary of the Employee is "+salary);
		System.out.println("*******************************************************");

	}
	
	protected void protectedModifierMethod(String message) {
		System.out.println(message);
	}
	
	public static void nonAccessModifiers() {
		
		final int value2 = 45;
		int value1 = 20;
		int sum = 23+value2;
		int sum2 = 30+value1;
		
		int value3 = 10+sum;
		value1 = 20+sum2+value2;
		
		System.out.println("The output of this method is :"+ sum+ ","+sum2
															+","+value3 +","+value1);
		
		
	}
	
	public synchronized void synchronizedAccessModifier() {
		System.out.println("This is a synchronized method");
	}
	
		

}
