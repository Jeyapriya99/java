package com.similar;

public class PalindromeMain {

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		String s = palindrome.process();
		System.out.println(s);
		if (palindrome.num1 == palindrome.sum) {
			System.out.println(" The given number is palindrome");
		} else {
			System.out.println(" The given number is not palindrome");
		}

	}

}

