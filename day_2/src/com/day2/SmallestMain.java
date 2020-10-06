/*method to find the smallest number among three numbers*/
package com.day2;

public class SmallestMain {

	public static void main(String[] args) {
		Smallest small = new Smallest();
		small.evaluate();
		if (small.num1 < small.num2 &  small.num1 < small.num3) {
			System.out.println("The smallest number is" + small.num1);

		} else if (small.num2 < small.num1 & small.num2 < small.num3) {
			System.out.println("The smallest number is" + small.num2);

		} else {
			System.out.println("The smallest number is" + small.num3);

	    
		
		}
	}
}

	

