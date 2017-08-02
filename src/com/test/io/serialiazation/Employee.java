package com.test.io.serialiazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 491638645712409138L;
	/**
	 * 
	 */
	transient	int id;
	transient String name;
	String address;
	String email;

	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:emp.ser"));

		Employee e = new Employee();
		e.id = 12;
		e.name = "hari";
		e.address = "BNG";

		oos.writeObject(e);
		oos.close();
		System.out.println("Sucessfully Serialized");
	}
}
