package com.harsha.javaPractice.collections.day12;

import java.util.Hashtable;

import org.testng.annotations.Test;

public class HashTableExample {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		hasTablePractice();
//	}
	
	@Test
	public static void hasTablePractice() {
		
		Hashtable<String, String> teamNames = new Hashtable<>();
		teamNames.put("India", "IND");
		teamNames.put("Srilanka", "SL");
		teamNames.put("South Africa", "SA");
		teamNames.put("Australia", "AUS");
		teamNames.put("Pakistan", "PAK");
		
		System.out.println(teamNames);
		System.out.println(teamNames.get("Australia"));
		System.out.println(teamNames.remove("Pakistan"));
		System.out.println(teamNames.containsKey("Srilanka"));
		System.out.println(teamNames.replace("South Africa", "RSA"));
		System.out.println(teamNames.containsValue("SA"));
		System.out.println(teamNames);
	}

}
