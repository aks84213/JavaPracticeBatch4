package com.harsha.javaPractice.arraysAndStrings.day6;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stringExample();
		//stringInterviewExample();
		hashCodeTest();
		//splitEmailIds();
	}
	
	public static void stringExample() {
		
		String emailId = " ETECHFactory@gmail.com ";
		Object password = 123456;
		String emptyValue = "t";
		Character newUpdatedId = 's';
		int age = 29;
		boolean flag = false;
		
		System.out.println(emailId.charAt(6)); //fetches the specified character from string 
		System.out.println(emailId.length()); //fetches the total number of characters in string
		System.out.println(emailId.substring(0, 6));//prints the characters present in between the start and end index
		System.out.println(emailId.substring(6));//prints the characters present after the specified index
		System.out.println(emailId.indexOf("@"));//fetches the specified index from the string based on character provided
		System.out.println(emailId.concat(" is my email ID"));//appends the string values provided
		System.out.println("My email ID is "+emailId+" and my age is "+age+"");//concatenate the variable values to the string
		System.out.println(emailId.contains("gmail"));//verifies the specified string is present in the variable
		System.out.println(emailId.endsWith("com"));//verifies the ending string in the variable
		System.out.println(emailId.startsWith("sri"));//verifies the starting string in the variable
		System.out.println(emailId.toCharArray());//converts string to character array
		System.out.println(emailId.equals("etechfactory@gmail.com"));//compares the two objects including case
		System.out.println(emailId.equalsIgnoreCase("ETECHFactory@gmail.com"));//compares the two objects ignoring the case
		System.out.println(emailId.hashCode()); //generates a unique number based on the string variable
		System.out.println(emptyValue.isEmpty());//check whether the variable is blank or not
		System.out.println(emailId.lastIndexOf("a"));//gives the index of last occurrence character specified
		System.out.println(emailId.replace("gmail", "yahoomail"));//replaces the characters specified
		System.out.println(emailId.replaceAll("a", "z")); //replaces all the character specified
		System.out.println(emailId.replaceFirst("a", "z")); //replaces only the first character specified
		System.out.println(emailId.toLowerCase()); //converts the string to lower case
		System.out.println(emailId.toUpperCase());  //converts the string to upper case
		String newValue = newUpdatedId.toString(); //converts any object type to String
		System.out.println(newValue.replace("s", "$")); //does replace operation for converted string
		System.out.println(password.toString()); //converting object to string
		System.out.println(emailId);
		System.out.println(emailId.trim()); //removes the spaces at the start and end of the string
		System.out.println(emailId.getClass());//provides the class name of the method getting executed
		String [] splitValue = emailId.split("@"); //split the string into an array and stores it in 2 indexes
		System.out.println(splitValue[0]); //prints the first index
		System.out.println(splitValue[1]); //prints the second index
		String convertedValue = String.valueOf(age); //converting integer data type to String
		System.out.println(convertedValue.replace("9", "5")); //replacing the characters of converted value
	

		
	}
	
	public static void stringInterviewExample() {
		
		//Check whether is there any duplicate character in the string
		String name = "sriharsha";
		char [] inputName = name.toCharArray();//[s,r,i,h,a,r,s,h,a]
		for(int i=0;i<name.length();i++) {  //it starts from 1st index i.e. 's'
			for(int j=i+1;j<name.length();j++) {  //it starts from 2nd index i.e. 'r'
				if(inputName[i]==inputName[j]) {  //comparing 1st and 2nd index
					System.out.println("The repeated character is :"+inputName[i]); //printing them if they are equal
				}
			}
		}
	}
	
	public static void hashCodeTest() {
		
		//Requirement: Store the details in a new file if the data changes 
		String details = "My name is Sriharsha, and i am working in Mysore, "
				+ "i have 9+ years of"
				+ "experience. I have worked on different automation projects and "
				+ "designed various frameworks";
		int hashcodename = details.hashCode();
		String fileName = "Filename"+hashcodename+"";
		System.out.println(fileName);
	}
	
	public static void splitEmailIds() {
		
		String [] inputEmailIds = {"subhranshup87@gmail.com", 
				"rajmohanrao.vs@gmail.com", 
				"rakhmb@gmail.com", 
				"Ramesh25sep@gmail.com", 
				"rama.bidarahalli@gmail.com", 
				"m.jshruthi@yahoo.com", 
				"tulaila@gmail.com"};
		
		for(int i=0;i<inputEmailIds.length;i++) {
		String [] splitEmailIds = inputEmailIds[i].split("@");
		System.out.println(splitEmailIds[0]);
		}
		System.out.println("*********************************************");
		for(int j=0;j<inputEmailIds.length;j++) {
			int indexOfCharac = inputEmailIds[j].indexOf("@");
			System.out.println("The index of @ is: "+indexOfCharac);
			System.out.println(inputEmailIds[j].substring(0, indexOfCharac));
		}
	}

}
