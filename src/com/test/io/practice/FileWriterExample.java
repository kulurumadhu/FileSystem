package com.test.io.practice;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("D:\\File\\xyz.txt");
		fw.write(100);
		fw.write('\n');
		fw.write('a');
		fw.write('\n');

		fw.write('b');
         char[]ch = {'d','f','g','h'};
         fw.write(ch);
		fw.write("Kumar");
		fw.write("Ram");
		fw.flush();
		fw.close();
		
	}
	
}
