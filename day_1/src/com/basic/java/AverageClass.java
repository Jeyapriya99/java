package com.basic.java;

import java.util.Scanner;

public class AverageClass {

	public float result() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number");
        int num2 = scan.nextInt();
        System.out.println("Enter the third number");
        int num3 = scan.nextInt();
        return (num1 + num2 + num3)/3 ;
	}

}
