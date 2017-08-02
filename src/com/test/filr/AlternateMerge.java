package com.test.filr;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class AlternateMerge {

	public static void main(String[] args) throws IOException {
		
		PrintWriter pw = new PrintWriter("F:\\Java\\file3.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("F:\\Java\\file1.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("F:\\Java\\file2.txt"));
		
		String line1=br1.readLine();
		String line2=br2.readLine();
		//while((line1!=null) ||(line2!=null)){
			
			while(line1!=null) {
				pw.println(line1);
				line1=br1.readLine();
			}
			while(line2!=null) {
				pw.println(line2);
				line2 = br2.readLine();
			}
			
		//}
		pw.flush();
		br1.close();
		br2.close();
		pw.close();
	}
}
