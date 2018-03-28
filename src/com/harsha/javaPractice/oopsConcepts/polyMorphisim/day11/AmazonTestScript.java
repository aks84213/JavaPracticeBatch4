package com.harsha.javaPractice.oopsConcepts.polyMorphisim.day11;

import com.harsha.javaPractice.oopsConcepts.interfaces.day10.SanityTestScript;

public class AmazonTestScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sanityHappyPath();
	}
	
	public static void sanityHappyPath() {
		
		AmazonUseCases amazon = new AmazonUseCases(); //Normal Reference data type
		AmazonCreateAccount createAccount = new AmazonUseCases(); //Type = AmazonCreateAccount & Reference = AmazonUseCases
		AmazonLaunchApplication launchApp = new AmazonUseCases(); //Type = AmazonLaunchApplication & Reference = AmazonUseCases
		
		createAccount.enterUsername();
		createAccount.enterPassword();
		amazon.enterAddress();
		amazon.enterDOB();
		createAccount.enterMobile();
		createAccount.clickSubmit();
		
		launchApp.enterApplicationUrl("www.amazon.in");
		launchApp.enterApplicationUrl("www.amazon.in", "Chrome");
		amazon.applicationLaunched();
	}

}
