package com.similar;

import java.util.Scanner;

public class Reverse {
	int num1;
	int sum = 0;
	int r;
	int temp;


	public String process1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		num1 = scan.nextInt();
		while (num1 > 0) {
			r = num1 % 10;
			sum = sum * 10 + r;
			num1 = num1 / 10;
			

		}
		return "checking";

}
}