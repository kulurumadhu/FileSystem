package com.test.io.serialiazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeserializationDemo implements Serializable {
	
       public static void main(String[] args) throws IOException, ClassNotFoundException {
		
    	  FileInputStream fis = new FileInputStream("D:\\File\\Productlist.txt");
    	  ObjectInputStream ois = new ObjectInputStream(fis);
    	  Product p =(Product) ois.readObject();
    	  System.out.println(p.productid);
    	  System.out.println(p.productName);
    	  System.out.println(p.price);
    	  System.out.println("Deserialization success");
	}
}
