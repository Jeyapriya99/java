package com.basic.java;

public class PrimeMain {

	public static void main(String[] args) {
		
		Prime prime = new Prime();
		prime.process();
		if (prime.count == 2) {
			System.out.println("The given number is a prime number");
		} else {
			System.out.println("The given number is not a prime number");

		}

	}

}
