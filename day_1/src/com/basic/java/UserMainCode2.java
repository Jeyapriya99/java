/* Java Program which finds the longest word from a sentence. Program should read a
sentence as input from user and return the longest word. In case there are two words 
of maximum length return the word which comes first in the sentence- main class */
package com.basic.java;

import java.util.StringTokenizer;

public class UserMainCode2 {
	public static String getLargestWord(String s1) {
		int max = 0;
		String s2 = new String();
		StringTokenizer t = new StringTokenizer(s1, " ");
		while (t.hasMoreTokens()) {
			String s3 = t.nextToken();
			int n = s3.length();
			if (n > max) {
				max = n;
			 s2 = s3;

			}

		}
		return s2;

	}

}
