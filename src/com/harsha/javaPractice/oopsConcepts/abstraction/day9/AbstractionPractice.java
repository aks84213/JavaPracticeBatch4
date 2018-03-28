package com.harsha.javaPractice.oopsConcepts.abstraction.day9;

//This class file contains all abstract methods related to connection of DB
public abstract class AbstractionPractice {

	//Connect to database
	public abstract void getUserName();  //get the username
	
	public abstract void getPassword(); //get the password
	
	public abstract void getSchema();  //get the schema
	
	public abstract void connectDatabase(String dbName, String dbUserName, 
			String dbPassword); //connect to DB using username and password
	
	public void getNumberOfTables() {
		System.out.println("The total tables in the DB are fecthed successfully");
	}    //get the number of tables
	
}
