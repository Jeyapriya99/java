//customized exception
package com.similar;

import java.util.Scanner;
class InvalidAgeException extends Exception {
	public  InvalidAgeException (String s)
	{
		super(s);
	}

}
 class PlayerMain {

	public static void main(String[] args) throws InvalidAgeException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the PlayerNme");
		String str = scan.nextLine();
		System.out.println("Enter the PlayerAge");
		 int age = scan.nextInt();
		 if(age < 19) {
			
		 throw new InvalidAgeException("The age should be above 19");
		 
		 }else {
			 System.out.println("Valid age");
		 }

	}

}
 
