package com.test.filr;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		
		//PrintWriter out = new PrintWriter(new FileWriter("F:\\Java\\abc.txt"));
		PrintWriter out = new PrintWriter("F:\\Java\\abc.txt");
		out.println(100);
		out.write(100);
		out.println();
		out.println("Nithin");
		out.flush();
		out.close();
	}
}
