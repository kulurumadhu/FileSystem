package com.test.io.practice;

import java.io.File;
import java.io.IOException;

public class DirectoryExample {
	
	public static void main(String[] args) throws IOException {
		
		
		File f = new File("F:\\Javafiles");
         System.out.println(f);
         //System.out.println(f.exists());//This exists method return false.because the directory is not created.
		f.mkdir();// This mkdir() method is used to create a directory.
		System.out.println(f.isDirectory());//This method checks directory is physically available or not.
		//System.out.println(f.exists());//It returns true.because the directory has created.
		
		// we create a file in speciafied  directory.
	  File f1 = new File(f,"product.txt");
	  //System.out.println(f1.exists());
	  System.out.println(f1.isFile());//this method checks wheather files represents physical directory  or not.
	  f1.createNewFile();
	  System.out.println(f1.exists());
	
	
	}

}
