package com.tns.dayone;

public class TypeCastingDemo {
	
	public static void main(String[] args) {
		
	
	
	//widening/implicit type casting
		
		byte b = 10;
		int i = b;
		
		System.out.println("int is; " + i);
		
		float f = 23.34f;
		double d = f;
		
		System.out.println("double is; " + d);
		
		char ch = 'h';
		int i2 = ch;
		
		System.out.println("i2 is: " + i2);
		
		char ch1 = '\u00A7';
		int i3 = ch1;
		
		System.out.println("i3 is: " + i3);
		
	//Narrowing /Explicit type casting
		
		double d1 = 11.52d;
		long l = (long) d1;
		
		System.out.println("l is: " + l);
		
		long l2 = 741852l;
		int i4 = (int) l2;
		
		System.out.println("i4 is: " + i4);
		
		float f2 = 12.54f;
		int i5 = (int) f2;
		
		System.out.println("i5 is: " + i5);
		
		byte b2 = 90;
		char ch2 = (char) b2;
		
		System.out.println("ch2 is: " + ch2);
		
	}	

}
