package com.test.filr;

import java.io.File;

public class ShowFileList {
public static void main(String[] args) {
	
	File f = new File("D:\\");
	 String[] s=f.list();
  int	count =0;
	 for(String s1:s) {
		 count++;
		 File  f1 = new File(f,s1);
		/* if(f1.isDirectory()) {
			 System.out.println(f1);
		 }*/
		/* 
		 if(f1.isFile()) {
			 System.out.println(f1);
		 }*/
		
	 }
		 
	 System.out.println("Total no of files in d:drive"+count);
}
}
