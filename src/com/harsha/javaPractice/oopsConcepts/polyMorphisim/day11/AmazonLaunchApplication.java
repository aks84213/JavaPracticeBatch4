package com.harsha.javaPractice.oopsConcepts.polyMorphisim.day11;

public abstract class AmazonLaunchApplication {
	
	public void launchFirefoxBrowser() {
		System.out.println("Firefox browser is launched");
		
	}
	
	public void enterApplicationUrl(String url) {
		System.out.println("The application url "+url+" is entered");
	}
	
	public void enterApplicationUrl(String url, String browser) {
		System.out.println("The application url "+url+" is "
				+ "entered in the browser "+browser+"");
	}

	public abstract void applicationLaunched();
}
