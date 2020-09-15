/*a  java program to read a number and calculate the sum of odd digits (values) present in the given number.*/
package com.basic.java;

import java.util.Scanner;

public class OddMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		 int number = scan.nextInt();
	int r	= Odd.checkSum(number);
	if (r == 1) {
		System.out.println("The sum of odd digits is odd");
	}else {
		System.out.println("The sum of odd digits is odd");
	}
		 

	}

}
