package com.test.filr;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class DeleteDuplicates {

	public static void main(String[] args) throws IOException {
		
		PrintWriter pw = new PrintWriter("F:\\Java\\file3.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("F:\\Java\\file1.txt"));
		String line1=br1.readLine();
		while(line1!=null) {
			
			boolean available =false;
			BufferedReader br2 = new BufferedReader(new FileReader("F:\\Java\\file2.txt"));
			String line2=br2.readLine();
			while(line2!=null) {
			if(line1.equals(line2)) {
				available=true;
				break;
			}
			line2=br2.readLine();
			}
			if(available==false) {
				pw.println(line1);
			}
			line1=br1.readLine();
		}
		pw.flush();
		br1.close();
		pw.close();
		
	}
}
