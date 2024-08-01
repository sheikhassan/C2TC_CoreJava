package com.hassan.assignmen3;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		// Create a object for Scanner class

		Scanner sc = new Scanner(System.in);

		// Read user's i/p;

		System.out.println("Enter the choice : \n 1->Air india,\n 2->King Fisher,\n 3->Indigo");
		int choice = sc.nextInt();// First input : 1->Air india, 2->King Fisher, 3->Indigo

		System.out.println("Enter the Total Hours of Travel : ");
		int hours = sc.nextInt();// Second input : Hours of Travel

		System.out.println("Enter the Cost PerHour : ");
		double costPerHour = sc.nextDouble();// Third input : Cost PerHour

		// Declare a reference variable for Airfare (interface)

		AirFare af = null;

		// Instantiate for class based on user's choice

		if (choice == 1) {

			af = new Air_India(hours, costPerHour);

		}

		else if (choice == 2) {

			af = new King_Fisher(hours, costPerHour);

		}

		else if (choice == 3) {

			af = new Indigo(hours, costPerHour);

		}
		
		else {
			System.out.println("Invalid Input");
			sc.close();//closing scanner class
			return;//Exit the program
		}
		
		//Display the calculated amount by calling the display method
		
		af.display();
		
	}

}
