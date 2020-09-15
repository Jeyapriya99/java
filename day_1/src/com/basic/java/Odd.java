/* A java program to read a number and calculate the sum of odd digits (values) present in the given number. */
package com.basic.java;

public class Odd {

	public static int checkSum(int number) {
		int number1;
		int sum = 0;
		int r;
		while (number != 0) {
			number1 = number % 10;
			if (number1 % 2 != 0) {
				sum = sum + number1;

			}
			number = number / 10;

		}
		if (sum % 2 == 0) {
			r = -1;
		} else {
			r = 1;
		}
		return r;
	}
}
