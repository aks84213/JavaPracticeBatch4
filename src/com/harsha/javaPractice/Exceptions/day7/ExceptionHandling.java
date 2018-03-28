package com.harsha.javaPractice.Exceptions.day7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.UncheckedIOException;
import java.net.ConnectException;
import java.nio.file.FileSystemNotFoundException;

import org.testng.annotations.Test;

public class ExceptionHandling {

//	public static void main(String[] args) throws Exception{
//		// TODO Auto-generated method stub
//		
//		//fileNotFoundExceptionHandlingPractice();
//		//nullPointerExceptionPractice();
//		//arrayIndexOutOfBoundExceptionPractice();
//		//throwNewExceptionPractice();
//		//tryCatchExceptionPractice();
//		//tryCatchBlockExample();
//		tryCatchFinallyBlockPractice();
//		
//
//	}
	
	@Test
	public static void fileNotFoundExceptionHandlingPractice() throws FileNotFoundException{
		
		File io = new File("G://Eclipse//Workspace");
		FileReader fileReader = new FileReader(io);
		
	}
	
	@Test
	public static void nullPointerExceptionPractice() {
		
		String username = "harsha@gmail.com";
		String password = "112333";
		String rememberMeCheckBox = null;
		
		System.out.println("Username entered :"+ username);
		System.out.println("Password entered :"+ password);
//		if(username.contains("harsha")) {
//			rememberMeCheckBox="true";
//		}
		if(rememberMeCheckBox.equals("true")) {
			System.out.println("User has opted for Remember me Option");
		}else {
			System.out.println("User has not opted for Remember me option");
		}
	}
	
	@Test
	public static void arrayIndexOutOfBoundExceptionPractice() {
		String [] itemList = {"Sofa", "Dining set", "Cot" ,"Study Table"};
		for (int i=0; i<itemList.length;i++) {
			System.out.println("My each item is: "+itemList[i]);
		}
	}
	
	@Test
	public static void throwNewExceptionPractice() throws Throwable {

		throw new Exception("This is my exception and its been designed by me !!!!");
	}
	
	@Test
	public static void tryCatchExceptionPractice() throws Exception{
		
		try {
			File io = new File("G://Eclipse//Workspace");
			FileReader fileReader = new FileReader(io);
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("This is my exception and its been designed by me !!!!");
			//System.out.println("FAIL -- The file is not found in that location");
		}
	}
	
	@Test
	public static void tryCatchBlockExample() {
		int mailCount = 5;
	
		String username = "harsha@gmail.com";
		String password = "112333";
		String rememberMeCheckBox = null;  //this check box is not present
		
		
		System.out.println("Username entered :"+ username);
		System.out.println("Password entered :"+ password);
		System.out.println("User logged in successfully");
	try {	
		if(rememberMeCheckBox.equals("true")) {
			System.out.println("PASS -- User has opted for Remember me Option");
		}else {
			System.out.println("PASS -- User has not opted for Remember me option");
		}
	}catch(Exception e) {
		System.out.println("FAIL -- Rememeber Me checkbox is not present");
	}
	if(mailCount>15) {
		System.out.println("PASS -- Mails are displayed successfully");
	}else {
		System.out.println("FAIL -- Mails are not displayed");
	}
	
		
	}
	
	@Test
	public static void tryCatchFinallyBlockPractice() throws Exception {
		System.out.println("*************Firefox browser is launched*********");
		int counter =0;
		String myCourse = "Python";
		String [] courses = {"Java", "Dotnet", "Selenium", "AWS", "DevOps"};
		try {
			for (int i=0; i<courses.length;i++) {
				System.out.println("Course evaluation is :"+courses[i]+"");
				if(myCourse.equals(courses[i])) {
				System.out.println("PASS -- My Course "+courses[i]+" is completed");
				}else {
				System.out.println("FAIL -- My Course "+courses[i]+" is not completed");
				counter++;
				}
				
			}if(counter==courses.length){
				throw new ConnectException("Course not found");
			}
			
		} catch (FileSystemNotFoundException e) {
			System.out.println("FAIL -- Excep 1: My Course "+myCourse+" is not listed under Etechfactory");
		}catch (ConnectException e1) {
			System.out.println("FAIL -- Excep 2: My Course "+myCourse+" is not listed under Etechfactory");
		}catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println("FAIL -- Excep 3: My Course "+myCourse+" is not listed under Etechfactory");
		}
		finally {
			System.out.println("*************Firefox browser is closed*********");
		}
	}
	

}
