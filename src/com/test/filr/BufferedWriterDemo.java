package com.test.filr;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("F:\\Java\\abc.txt");
		BufferedWriter br = new BufferedWriter(fw);
		br.write('a');
		br.newLine();
		br.write("MaheshBabu");
		br.newLine();
		char[] ch= {'a','c','d','f'};
		br.write(ch);
		br.flush();
		br.close();
	}
}
