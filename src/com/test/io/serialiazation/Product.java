package com.test.io.serialiazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Product implements Serializable {

	
	static int productid;
	transient  String productName;
	 int price;
	
	/*public Product(int productid, String productName, int price) {
		this.productid = productid;
		this.productName = productName;
		this.price = price;
	}
	*/
	
 
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//Product product = new Product(10, "LgTv", 40000);
		Product product = new Product();
		product.productid=1;
		product.productName="sony";
		product.price=19000;
		
		FileOutputStream fos = new FileOutputStream("D:\\File\\Productlist.txt");
		ObjectOutputStream oos  = new ObjectOutputStream(fos);
		oos.writeObject(product);
		 System.out.println("Srializable"+oos);   
          		
		 //Deserialization
		 
		 FileInputStream fis = new FileInputStream("D:\\File\\Productlist.txt");
		 ObjectInputStream ois = new ObjectInputStream(fis);
		 Product product2 = (Product) ois.readObject();
		 System.out.println(product2.productid);
		 System.out.println(product2.productName);
		 System.out.println(product2.price);
	}
	
}
