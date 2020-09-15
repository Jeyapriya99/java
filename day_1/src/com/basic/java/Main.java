package com.basic.java;

public class Main {

	public static void main(String[] args) {
		Operations operations = new Operations();
		int value1 = operations.add(20, 4);
		int value2 = operations.sub(20, 4);
		int value3 = operations.mul(20, 4);
		int value4 = operations.div(20, 4);
        System.out.println(" The addition of two numbers is " +value1);
        System.out.println(" The subtraction of two numbers is " +value2);
        System.out.println(" The multiplication of two numbers is " +value3);
        System.out.println(" The division of two numbers is " +value4);
	}
	

}
