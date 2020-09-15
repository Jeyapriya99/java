/* Java Program which finds the longest word from a sentence. Program should read a
sentence as input from user and return the longest word. In case there are two words 
of maximum length return the word which comes first in the sentence- processing class */
package com.basic.java;

import java.util.Scanner;

public class StringMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = UserMainCode2.getLargestWord(s1);
		System.out.println(s2);

	}

}
