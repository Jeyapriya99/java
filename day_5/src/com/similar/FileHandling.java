package com.similar;

import java.io.*;

public class FileHandling {

	public static void main(String args[]) throws IOException {
		FileInputStream fis = null;
		fis = new FileInputStream("B:/myfile.txt");
		int k;

		while ((k = fis.read()) != -1) {
			System.out.print((char) k);
		}
		fis.close();
	}
}
