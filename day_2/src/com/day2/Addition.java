package com.day2;

import java.util.Scanner;

public class Addition {
	int num;
	int sum = 0;

	public void process() {
		
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number");
	num = scan.nextInt();
	for (int i=1;i<=num;i++) {
		sum = sum + i;
		scan.close();
	}

}
}
