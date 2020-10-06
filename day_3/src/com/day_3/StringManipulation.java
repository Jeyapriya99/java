/*8.	Write a program to read a string and return a modified string based on the following rules.
Return the String without the first 2 characters except when
a.	Keep the first char if it is 'k'
b.	Keep the second char if it is 'b'.*/

package com.day_3;

import java.util.Scanner;

public class StringManipulation {
	public static String getString() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scan.nextLine();
		if(str.length() > 0) {
		    if(str.substring(0,1).equals("k") && !str.substring(1,2).equals("b")) {
		      return str.substring(0,1) + str.substring(2,str.length());
		    } else if(str.substring(1,2).equals("b") && !str.substring(0,1).equals("k")) {
		      return str.substring(1,2) + str.substring(2,str.length());
		    } else if(str.substring(0,1).equals("k") && str.substring(1,2).equals("b")) {
		      return str;
		    } else {
		      return str.substring(2,str.length());
		    }
		  } else {
		    return "";
		  }
		}
}
		
		