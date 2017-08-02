package com.test.filr;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		
		File f = new File("F:\\Java\\abc.txt");
		System.out.println(f.exists());//false
		f.createNewFile();
		System.out.println(f.exists());//true
		//f.delete();
	}
}
