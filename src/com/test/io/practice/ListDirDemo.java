package com.test.io.practice;

import java.io.File;

public class ListDirDemo {
	public static void main(String[] args) {
		 int count=0;

		File fl = new File("D:\\File");
		
	 String[] st=fl.list();
	 
	 for(String s1:st) {
		 File file = new File(fl,s1);
		 if(file.isDirectory()) {
			 count++;
   System.out.println(file);			
		 }
	 }
	 System.out.println("Total no of directories"+count);
	}

}
