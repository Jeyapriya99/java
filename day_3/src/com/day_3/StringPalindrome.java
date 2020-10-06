/*Given a string , print ‘true’ if it is a palindrome, print ‘false’ otherwise. */
package com.day_3;

import java.util.Scanner;

public class StringPalindrome {

	boolean r;

	public boolean operation() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = scan.nextLine();
		int i = 0;
		int j = s1.length() - 1;
		while (i < j) {
			if (s1.charAt(i) != s1.charAt(j)) {
				r = false;
			} else {
				r = true;

			}
			i++;
			j--;

		}
		return r;
	}
}
