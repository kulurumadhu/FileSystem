package com.test.filr;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("F:\\Java\\abc.txt");
		fw.write('a');
		
		fw.write('b');
		fw.write('c');
		fw.write('d');
		char[] ch = {'a','c','d','f'};
		fw.write("\n");
		fw.write(ch);
		fw.flush();
		fw.close();
	}
}
