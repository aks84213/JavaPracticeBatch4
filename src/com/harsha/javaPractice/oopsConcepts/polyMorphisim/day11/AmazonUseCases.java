package com.harsha.javaPractice.oopsConcepts.polyMorphisim.day11;

public class AmazonUseCases extends AmazonLaunchApplication implements AmazonCreateAccount{

	@Override
	public void enterUsername() {
		System.out.println("Username entered");
		
	}

	@Override
	public void enterPassword() {
		System.out.println("Password entered");
		
	}

	@Override
	public void enterAddress() {
		System.out.println("Address entered");
		
	}

	@Override
	public void enterDOB() {
		System.out.println("DOB entered");
		
	}

	@Override
	public void enterMobile() {
		System.out.println("Mobile number entered");
		
	}

	@Override
	public void clickSubmit() {
		System.out.println("Submit button clicked");
		
	}

	@Override
	public void applicationLaunched() {
		System.out.println("Amazon application launched successfully");
		
	}

}
