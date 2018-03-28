package com.harsha.javaPractice.oopsConcepts.inheritance.day8;

public class SonInheritance2 extends FatherInheritance{

	public SonInheritance2() {
		this.fatherProperty1("Harsha");
		this.fatherProperty2("Harsha", "3BHK Villa");
		this.gfProperty4("Harsha", "Office", 1000000);
		this.arithmeticOperations();
		this.logicalOperations();
		this.sonProperty3();
	}

	
	public static void sonProperty3() {
		FatherInheritance fatherInheritance = new FatherInheritance();
		//GrandFatherInheritance gfInheritance = new GrandFatherInheritance();
		
		fatherInheritance.fatherProperty2(fatherInheritance.propertyName, 
				fatherInheritance.propertyType);
		fatherInheritance.gfProperty2(fatherInheritance.propertyName);
		
		//gfInheritance.arithmeticOperations();
		fatherInheritance.arithmeticOperations();

	}

	
}
