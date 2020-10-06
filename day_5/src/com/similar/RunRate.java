/*Given total runs scored and  total overs faced as the input. Write a program to calculate the run
 *  rate with the formula,
 
Run rate= total runs scored/total overs faced.
Use BufferedReader class to get the inputs from user.
 This program may generate Arithmetic Exception / NumberFormatException.
 Use exception handling mechanisms to handle this exception. Use a single catch block. 
 In the catch block, print the class name of the exception thrown.*/

package com.similar;

import java.util.*;

public class RunRate {
	Scanner scan = new Scanner(System.in);
	int runs, overs;
	float runRate;

	public void input() {
		try {
			System.out.println("Enter Runs Scored: ");
			runs = scan.nextInt();
			System.out.println("Enter overs Delivered: ");
			overs = scan.nextInt();
		} catch (NumberFormatException e) {
			System.out.println("Error Code: " + e);
			System.exit(0);
		}
	}

	public void compute() {
		runRate = runs / overs;
		System.out.println("Score is " + runs + " runs in " + overs + " overs with the Run Rate of " + runRate
				+ " runs per over.");
	}

	public static void main(String[] args) {
		RunRate obj = new RunRate();
		obj.input();
		obj.compute();
	}
}
