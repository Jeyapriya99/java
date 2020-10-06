package com.day_3;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
        String S = in.next();
        System.out.println("Enter the start index");
        int start = in.nextInt();
        System.out.println("Enter the ending index");
        int end = in.nextInt();
        
        
        System.out.println(S.substring(start,end));
        in.close();
    }

	}


