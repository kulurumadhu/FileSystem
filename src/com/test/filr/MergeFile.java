package com.test.filr;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeFile {

	public static void main(String[] args) throws IOException {
		
		PrintWriter pw = new PrintWriter("F:\\Java\\file3.txt");
		BufferedReader br =new BufferedReader(new FileReader("F:\\Java\\file1.txt"));
		String line1=br.readLine();
		while(line1!=null) {
			pw.println(line1);
			line1=br.readLine();
		}
		br=new BufferedReader(new FileReader("F:\\Java\\file2.txt"));
		String line2=br.readLine();
		while(line2!=null) {
			pw.println(line2);
			line2=br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();
	}
}
