package com.tns.daythree;

public class Student extends Citizen {

	private int rollNo;

	private String collegeName;

	public Student() {

		super();

	}

	public Student(String name, String aadharNo, String address, long phno, int rollNo, String collegeName) {

		super(name, aadharNo, address, phno);

		// accessing parent class constructor

		this.rollNo = rollNo;

		this.collegeName = collegeName;

	}

	public int getrollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getcollegeName() {
		return rollNo;

	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override

	public String toString() {

		return "Student [rollNo = " + rollNo + ", collegeName = " + collegeName + ", Name = " + getName()
				+ ", AadharNo = " + getAadharNo() + ", Address = " + getAddress() + ", phno = " + getPhno() + " ]";

	}
}
