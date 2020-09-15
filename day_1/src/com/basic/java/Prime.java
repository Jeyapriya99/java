package com.basic.java;
import java.util.Scanner;

public class Prime {
	int num1;
	int count = 0;

	public void process() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		 int num1 = scan.nextInt();
		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0) {
				count++;
				scan.close();

			}
		}
	}
}
