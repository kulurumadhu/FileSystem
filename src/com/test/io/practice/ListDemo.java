package com.test.io.practice;

import java.io.File;

public class ListDemo {
	public static void main(String[] args) {
		int count =0;
		File f = new File("D:\\File");
      String[] s= f.list();
      
      for(String s1:s) {
    	  File f1 = new File(f,s1);
    	  if(f1.isFile()) {
    		  count++;
        	  System.out.println(f1);

    	  }
      }
	    
      System.out.println("Total No of Files and Directories in D:drive"+count);
	
	}
	
	 

}
