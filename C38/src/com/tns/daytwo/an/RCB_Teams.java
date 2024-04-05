package com.tns.daytwo.an;

public class RCB_Teams {

	public String name;

	public int age;

	public int jerseyNo;

	public String getName() {
		return name;
	}

	public void setName(String Name) {
		this.name = Name;
	}

	public int getage() {
		return age;
	}

	public void setage(int age) {
		this.age = age;
	}

	public int getjerseyNo() {
		return jerseyNo;
	}

	public void setjersyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}

	public static void main(String[] args) {
		RCB_Teams rc = new RCB_Teams();

		rc.setName("Hassan");
		rc.setage(20);
		rc.setjersyNo(11);

		System.out.println("name : " + rc.getName());

		System.out.println("age : " + rc.getage());

		System.out.println("jersey : " + rc.getjerseyNo());

	}

}
