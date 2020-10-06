/*a Java method to display the middle character of a string. 
a) If the length of the string is odd there will be two middle characters.
 b) If the length of the string is even there will be one middle character.*/

package com.day2;


public class Middle {
	public static String method(String s1) {
	
	int position;
	int length;
	if(s1.length() % 2 == 0) {
		position = s1.length() / 2 - 1;
		length = 2;
	}else {
		position = s1.length() / 2;
		length = 1;
	}
	return s1.substring(position,position+length);

	}

}
