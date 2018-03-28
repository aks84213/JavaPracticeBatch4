package com.harsha.javaPractice.methods.day3;

import com.harsha.javaPractice.oopsConcepts.inheritance.day8.SonInheritance;

public class MethodsAndVariables {
	
	 static int instanceVariable = 100;
	 public static String instanceVariable2 = "This can be accessed in all methods within this class";

	public static void main(String[] args) {
		methodsAndVariables();
		//SonInheritance son1 = new SonInheritance();
		
			}
	
	public static void methodsAndVariables() {
		int a = 25;  //integer 
		int b = 20;  //integer
		String courseName = "Java and Selenium Course";  //String
		String trainerName = "Harsha";
		double timings = 7.30;   //decimal values
		
		boolean classStatus = true;
		
		int totalHours;
		totalHours = a+b;
		
		System.out.println(courseName+" will be taken for "+ totalHours
				+ " hours at the time "+ timings+ " for every 4 days and the status is: "
				+classStatus + " and the trainer name is "+trainerName);
		
	
		
		subtractTwoNumbers();
		System.out.println(CallingOfMethods.accessPublicVariable());   //className.methodname
	
		
		
		// MethodsAndVariables(C)-->Main method -->subtractTwoNumbers-->multiplyTwoNumbers--> getRemainder
		// --> CallingOfMethods(C)-->accessPublicVariable-->MethodsAndVariables(c)-->instanceVariable2


	}


	 public static void subtractTwoNumbers() {
		int x = 50;
		int y = 30;

		String trainerName = "Harsha";
		int result  = x-y;
		System.out.println("Result of the operation is: "+ result);
		System.out.println("Trainer name is: "+trainerName);
		System.out.println(instanceVariable2);
		System.out.println("The instance variable is: "+instanceVariable);

		//multiplyTwoNumbers(20, 25);
	
	}
	
	
	//This is a void method without any return type
	public void multiplyTwoNumbers(int num1, int num2) {
		
		int product = num1*num2;  //A
		System.out.println("**************************************************************");
		System.out.println("Product of these 2 numbers is: "+product);
		int remainder = getRemainder(num1, num2);   //C
		int finalResult = product+remainder;  //B
		System.out.println("Final Result of these 2 numbers is: "+ finalResult);
	
		
	}
	
	//This is a return type method with integer
	public static int getRemainder(int num1, int num2) {
		String message  = "Remainder of this operation is: ";
		int result = num1 % num2;
		System.out.println(message+result);
		return result;
		
	//	System.out.println("Method execution is complete");
	}
	
	

}
