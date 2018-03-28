package com.harsha.javaPractice.arraysAndStrings.day6;

public class TwoDimensionalArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			twoDimensionalArrayExample();
	}
	
	public static void twoDimensionalArrayExample() {
		
		int [][] array1 = new int [3][4]; //rows & columns
		
		array1[0][0] = 3;
		array1[0][1] = 4;
		array1[0][2] = 5;
		array1[0][3] = 6;
		array1[1][0] = 7;
		array1[1][1] = 19;
		array1[1][2] = 22;
		array1[1][3] = 11;
		array1[2][0] = 111;
		array1[2][1] = 98;
		array1[2][2] = 23;
		array1[2][3] = 65;

		
		for(int row=0; row<3;row++) {
			for (int col=0; col<4; col++) {
				System.out.println(array1[row][col]);
			}
		}
	}

}
