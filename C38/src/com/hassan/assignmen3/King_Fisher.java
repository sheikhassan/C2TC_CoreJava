package com.hassan.assignmen3;

public class King_Fisher implements AirFare{
	
	private int hours;
	private double costPerHour;
	
	King_Fisher() {

	}
	
	public King_Fisher(int hours, double costPerHour){
		
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
		
		return hours * costPerHour * 4;
	}

	@Override
	public void display() {
		
		System.out.println("King_Fisher-Total_Amount : " + String.format("%.2f", calcAmount()));
		
	}

}
