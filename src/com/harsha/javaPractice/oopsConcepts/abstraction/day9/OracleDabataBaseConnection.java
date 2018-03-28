package com.harsha.javaPractice.oopsConcepts.abstraction.day9;

//This class contains all the implementations of the methods related to Oracle DB
public class OracleDabataBaseConnection extends AbstractionPractice{

	@Override
	public void getUserName() {
		System.out.println("Get the Oracle DB username");
	}

	@Override
	public void getPassword() {
		System.out.println("Get the Oracle DB Password");
	}

	@Override
	public void connectDatabase(String dbName, String dbUserName, String dbPassword) {
		System.out.println("Enter Oracle dbName :"+dbName);
		System.out.println("Added oracle db details with specific IP");
		System.out.println("Enter Oracle dbUsername :"+dbUserName);
		System.out.println("Enter Oracle dbPassword :"+dbPassword);
	}
	
	@Override
	public void getSchema() {
		System.out.println("Get the Oracle DB Schema");
		
	}


}
