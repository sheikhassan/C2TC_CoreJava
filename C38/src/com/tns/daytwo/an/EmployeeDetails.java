package com.tns.daytwo.an;

public class EmployeeDetails {
	
	private String name;
	private int age;
	private int idNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name; // this refer to class's words
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getIdNo() {
		return idNo;
	}

	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}

	public static void main(String[] args) {

		EmployeeDetails obj = new EmployeeDetails();

		obj.setName("Hassan");
		obj.setAge(20);
		obj.setIdNo(4014);

		System.out.println("Name : " + obj.getName());
		System.out.println("Age : " + obj.getAge());
		System.out.println("Employee ID : " + obj.getIdNo());

	}


}
