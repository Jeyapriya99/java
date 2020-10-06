/*
9.	Write a program to read a string and a character, and reverse 
the string and convert it in a format such that each character is separated by the given 
character. Print the final string.*/


package com.day_3;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		reShape(s1);
		}
		public static String reShape(String s) {
		 
		StringBuffer sb = new StringBuffer(s);
		StringBuffer sb2 = new StringBuffer();
		String s2 = sb.reverse().toString();
		for (int i = 0; i < s2.length(); i++) {
		sb2.append(s2.charAt(i));
		sb2.append("-");
		}
		sb2.deleteCharAt(sb2.length() - 1);
		System.out.println(sb2.toString());
		return sb2.toString();
		}

	}


