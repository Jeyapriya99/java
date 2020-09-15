package com.basic.java;

import java.util.Scanner;

public class Swap {
	int num1;
	int num2;
	
	
	public void operation(){
		
		
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the first number");
    num1 = scan.nextInt();
    System.out.println("Enter the second number");
    num2 = scan.nextInt();
    int temp = num1;
    num1 = num2;
    num2 = temp;

}
}