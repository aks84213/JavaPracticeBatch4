package com.harsha.javaPractice.collections.day12;

import java.util.Stack;

import org.testng.annotations.Test;

public class StackExample {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		stackPractice();
//	}
	
	@Test
	public static void stackPractice() {
		
		Stack<String> teamPlayers = new Stack<>();
		teamPlayers.push("Kohli");
		teamPlayers.push("Dhoni");
		teamPlayers.push("AB De Villiers");
		teamPlayers.push("Smith");
		
		System.out.println(teamPlayers);
		System.out.println(teamPlayers.empty());
		System.out.println(teamPlayers.peek());
		System.out.println(teamPlayers);
		System.out.println(teamPlayers.pop());
		System.out.println(teamPlayers.size());
		System.out.println(teamPlayers.search("Kohli"));
		System.out.println(teamPlayers);
	}

}
