/* A Java program to read a number, calculate the sum of squares of even digits (values) present
in the given number*/
package com.basic.java;

public class UserMainCode {
	public static int sumOfSquaresOfEvenDigits(int number) {

		int number1;
		int sum = 0;
		int square;
		while (number != 0) {
			number1 = number % 10;
			if (number1 % 2 == 0) {
				square = number1 * number1;
				sum = sum + square;

			}
			number = number / 10;

		}

		return sum;
	}

}
