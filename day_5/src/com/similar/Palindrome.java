package com.similar;

import java.util.Scanner;

public class Palindrome {
	int num1;
	int sum = 0;
	int r;
	int temp;

	public String process() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		num1 = scan.nextInt();
		temp = num1;
		while (num1 > 0) {
			r = num1 % 10;
			sum = sum * 10 + r;
			num1 = num1 / 10;
			

		}
		num1 = temp;
		return "checking";

	}

}
