package com.harsha.javaPractice.constructor.day8;

public class ConstructorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void sampleMethod1() {
		
		System.out.println("This is a sample method 1 which prints the statement");
	}
	
	public void sampleMethod2() {
		
		System.out.println("This is a sample method 2 which prints the statement");
	}
	
	public static void sampleMethod3() {
		
		System.out.println("This is a sample method 3 which prints the statement");
	}
	

	
	
	public ConstructorPractice(String message, String value) {
		// TODO Auto-generated constructor stub
		System.out.println("This is a constructor with parameters and it has "+message+""
				+ " and "+value+"");
	}
	
	public ConstructorPractice(int message, boolean value) {
		// TODO Auto-generated constructor stub
		System.out.println("This is a constructor with different parameters and it has "+message+""
				+ " and "+value+"");
	}
	
	public ConstructorPractice() {
		// TODO Auto-generated constructor stub
		System.out.println("This statement is executed from the Constructor");
	}
	
	

}
