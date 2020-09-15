package com.basic.java;

import java.util.Scanner;

public class Character {

	public static void main(String[] args) {
	    char character;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character");
		character = scan.next().charAt(0);
		int value = character;
			
				System.out.println("The ASCII value of the character is :"+value);
			}
		
}
