package com.test.io.practice;

import java.io.File;
import java.io.IOException;

public class FileExample {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("abcd.txt");
		System.out.println(f.exists());//This method is used to check wheather the file is avaliable or not.
		//if the file is not create it returns false.
		f.createNewFile();//This method is used to create a  file.
		
		System.out.println(f.exists());//it retuns true.because the file has created .
	}

}
