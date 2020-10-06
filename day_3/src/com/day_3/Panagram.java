package com.day_3;

public class Panagram {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		String str2 = str.toLowerCase();
		String str3 = str2.replaceAll("\\s", "");

		System.out.println(checkPanagram(str3));
	}

	private static boolean checkPanagram(String str3) {
		if (str3.length() < 26) {
			return false;
		} else {
			for (char ch = 'a'; ch <= 'z'; ch++) {
				if (str3.indexOf(ch) < 0) {
					return false;
				}
			}
		}
		return true;
		

	}

}
