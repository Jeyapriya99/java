/* A Java program to read a number, calculate the sum of squares of even digits (values) present
in the given number*/
package com.basic.java;

import java.util.Scanner;

public class MainSquare {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scan.nextInt();
		int sum = UserMainCode.sumOfSquaresOfEvenDigits(number);

		System.out.println("The sum of sqaures of even digits is" + sum);

	}

}
