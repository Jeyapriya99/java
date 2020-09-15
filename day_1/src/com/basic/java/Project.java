/*a Java program which iterates the integers from 1 to 100. For multiples of three print "Fizz"
instead of the number and print "Buzz" for the multiples of five.
When number is divided by both three and five, print "fizz buzz".*/
package com.basic.java;

public class Project {
	public void method() {
	      for (int i= 1;i<=100;i++) {
	    	  if(i % 3 ==0) {
	    		  System.out.println("fizz"+" " + i);
	    	  }
	    	  if (i % 5 == 0) {
	    		  System.out.println("buzz" +" " + i);
	    	  }
	    	  if((i % 3==0)&&(i % 5 == 0)) {
	    		  System.out.println("fizzbuzz"+" " + i);
	    	  }
	    		 
	      }
	    	  
	      }
	}


