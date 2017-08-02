package com.test.filr;

import java.io.File;

public class ShowListDemo {

	public static void main(String[] args) {
		int count=0;
		File f = new File("C:\\");
		String [] s=f.list();
		for(String s1 :s) {
			count++;
			System.out.println(s1);
		}
		System.out.println("The total number of files are: "+count);
	}
}
