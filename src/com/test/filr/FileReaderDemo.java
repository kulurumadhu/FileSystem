package com.test.filr;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("F:\\Java\\abc.txt");
		int i=fr.read();
		while(i!=-1) {
			System.out.println((char)i);
			i=fr.read();
		}
	}
}
