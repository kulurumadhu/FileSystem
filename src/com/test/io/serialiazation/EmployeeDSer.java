package com.test.io.serialiazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class EmployeeDSer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:emp.ser"));
		Object obj = ois.readObject();

		Employee e = (Employee) obj;

		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.address);

		ois.close();
		System.out.println("Sucessfully Deserialized");

	}
}
