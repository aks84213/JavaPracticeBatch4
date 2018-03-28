package com.harsha.javaPractice.collections.day12;

import java.util.HashMap;

public class HashMapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashMapExample();
	}
	
	public static void hashMapExample() {
		HashMap<String, Integer> courseDuration = new HashMap<>();
		courseDuration.put("JAVA", 45);
		courseDuration.put("Python", 40);
		courseDuration.put("Selenium", 25);
		courseDuration.put("Python", 30);		
		courseDuration.put("Dotnet", 80);
		courseDuration.put("AWS", 25);

		
		System.out.println(courseDuration);
		
		System.out.println(courseDuration.containsKey("DevOps"));//it will check the specified key is present in map or not
		System.out.println(courseDuration.get("Python"));//it will fetch the value for the key provided
		System.out.println(courseDuration.remove("Dotnet"));//it removes the key and value specified
		System.out.println(courseDuration);
		courseDuration.clear();
		System.out.println(courseDuration);
	}

}
