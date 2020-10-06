package com.day_3;

import java.util.Scanner;

public class Biggest {
	int size;
	int large;

	public void process() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		size = scan.nextInt();
		int[] num = new int[size];
		System.out.println("Enter the elements of the array");

		for (int i = 0; i < size; i++) {

			num[i] = scan.nextInt();
		}

		large = num[0];
		for (int i = 0; i < size; i++) {

			if (num[i] > large) {
				large = num[i];

			}
		}

	}
}
