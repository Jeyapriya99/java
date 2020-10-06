/*a Java method to count all vowels in a string. */
package com.day2;

import java.util.Scanner;

public class VowelsMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = scan.nextLine();
		int value = Vowels.count_Vowels(str);
		System.out.println(value);
		scan.close();

	}

}
