/*a Java program to replace all the 'd' occurrence characters with ‘h’ characters in each string.*/


package com.day_3;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		    String str   = s1.replace('d', 'h');
		    System.out.println(str);
		    scan.close();


	}

}
