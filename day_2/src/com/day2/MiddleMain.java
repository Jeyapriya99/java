/*a Java method to display the middle character of a string. 
a) If the length of the string is odd there will be two middle characters.
 b) If the length of the string is even there will be one middle character.*/

package com.day2;

import java.util.Scanner;

public class MiddleMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string ");
		String s1 = scan.nextLine();
		String value = Middle.method(s1);
		System.out.println(value);
		scan.close();

	}

}