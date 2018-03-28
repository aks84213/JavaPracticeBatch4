package com.harsha.javaPractice.oopsConcepts.abstraction.day9;

//This class contains all the implementations of the methods related to Mongo DB
public class MongoDatabaseConnection extends AbstractionPractice{

	@Override
	public void getUserName() {
		System.out.println("Get the Mongo DB username");
	}

	@Override
	public void getPassword() {
		System.out.println("Get the Mongo DB Password");
	}

	@Override
	public void connectDatabase(String dbName, String dbUserName, String dbPassword) {
		System.out.println("Enter Mongo dbName :"+dbName);
		System.out.println("Added Mongo db details with specific IP");
		System.out.println("Enter Mongo dbUsername :"+dbUserName);
		System.out.println("Enter Mongo dbPassword :"+dbPassword);
	}

	@Override
	public void getSchema() {
		System.out.println("Get the Mongo DB Schema");
		
	}
	
	public void getNumberOfTables() {
		System.out.println("The total tables in the Mongo DB are fecthed successfully");
	}


}
