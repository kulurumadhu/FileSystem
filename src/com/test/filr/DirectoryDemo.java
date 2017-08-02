package com.test.filr;

import java.io.File;
import java.io.IOException;

public class DirectoryDemo {

	public static void main(String[] args) throws IOException {
		
		File f = new File("F:\\Java\\JavaHome");
		System.out.println(f.isDirectory());
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
		File f1 = new File(f,"test.txt");//di
		f1.createNewFile();
		
	}
}
