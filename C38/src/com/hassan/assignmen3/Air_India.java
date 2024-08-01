package com.hassan.assignmen3;

public class Air_India implements AirFare {

	private int hours;
	private double costPerHour;
	
	Air_India() {

	}
	
	public Air_India(int hours, double costPerHour){
		
		this.hours = hours;
		this.costPerHour = costPerHour;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getCostPerHour() {
		return costPerHour;
	}

	public void setCostPerHour(double costPerHour) {
		this.costPerHour = costPerHour;
	}

	@Override
	public double calcAmount() {
		
		return hours * costPerHour;
	}

	@Override
	public void display() {
		
		System.out.println("Air_India-Total_Amount : " + String.format("%.2f", calcAmount()));
		
	}

}
