package com.hassan.assignment.employees;

public class AssignmentMain {

	public static void main(String[] args) {

		Manager m = new Manager();

		System.out.println("Manager's Details");

		m.setManagerName("Hassan");
		m.setManagerId(4014);
		m.setManagerSalarY(10000000);

		System.out.println(m.getManagerId());
		System.out.println(m.getManagerName());
		System.out.println(m.getManagerSalarY());
		System.out.println();

		Developer d = new Developer();

		System.out.println("Developer's Details");

		d.setDeveloperId(564);
		d.setDeveloperName("Ismail");
		d.setDeveloperSalarY(500000);

		System.out.println(d.getDeveloperId());
		System.out.println(d.getDeveloperName());
		System.out.println(d.getDeveloperSalarY());

	}

}
