/*a Java program to convert all the characters in a string to lowercase */
package com.day_3;

import java.util.Scanner;

public class Lower {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		    String str   = s1.toLowerCase();
		    System.out.println(str);
		    scan.close();

	}

}
