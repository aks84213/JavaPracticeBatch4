package com.harsha.javaPractice.constructor.day8;

import com.harsha.javaPractice.oopsConcepts.inheritance.day8.SonInheritance;

public class UsingConstructorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		useConstructor();

	}
	
	public static void useConstructor() {
	
		ConstructorPractice constr = new ConstructorPractice("Constructor1", "100");
		ConstructorPractice constru = new ConstructorPractice(40, false);
		ConstructorPractice constructorPractice = new ConstructorPractice();
		ConstructorPractice constructor = new ConstructorPractice();
		ConstructorPractice cons = new ConstructorPractice();
		
		SonInheritance son = new SonInheritance();

		
		constructorPractice.sampleMethod1();
		constructorPractice.sampleMethod2();
		ConstructorPractice.sampleMethod3();
	}

}
