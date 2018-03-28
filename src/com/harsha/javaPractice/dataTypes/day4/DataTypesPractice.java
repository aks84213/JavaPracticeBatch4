package com.harsha.javaPractice.dataTypes.day4;

import com.harsha.javaPractice.methods.day3.MethodsAndVariables;

public class DataTypesPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//dataTypes();
		callAccessModifiersMethods();
		System.out.println("*********************************");
		System.out.println("The Status of the user is: "+ EnumsStatus.Deactive);
	}

	
	public static void dataTypes() {
		
		int value1 = 67;
		boolean flag = true;
		double height = 6.2;
		
		double difference = value1 - height; 
		System.out.println(difference);
		
		//Parentname objectname = new Reference object;
		MethodsAndVariables methods = new MethodsAndVariables();
		methods.multiplyTwoNumbers(50, 60);
		int result = methods.getRemainder(20, 3);
		System.out.println("The reminder of these two numbers are "+result);
		
	}
	
	public static void callAccessModifiersMethods() {
		
		AccessModifiersPractice access = new AccessModifiersPractice();
		access.accessModifiers();
		access.globallyAccessibleMethod("Harsha", 29, "EtechFactory", 
									EnumsStatus.Active.toString(), true,355000);
		access.protectedModifierMethod("This is a protected modifier method");
		
		for (int i=0; i<4; i++) {
			EnumsStatus [] enumStatus = EnumsStatus.values();
			System.out.println(enumStatus[i]);
		}
		
	}
}
