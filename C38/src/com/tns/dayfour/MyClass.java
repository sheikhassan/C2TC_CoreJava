package com.tns.dayfour;

public class MyClass {

	private static int section;

	private static int srNo;

	// static block

	static {
		System.out.println("---Within static Block---");

		srNo = 3118;

	}

	// default constructor

	MyClass() {

		srNo--;

		
	}

	public static void main(String[] args) {

		MyClass mc = new MyClass();

		System.out.println(section);
		System.out.println(srNo);
		
	}
}
