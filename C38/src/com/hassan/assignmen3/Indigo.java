package com.hassan.assignmen3;
public class Indigo implements AirFare {
    private int hours;
    private double costPerHour;

    // Default Constructor
    public Indigo() {}

    // Parameterized Constructor
    public Indigo(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    // Getters and Setters
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

    // Implementing calculateAmount method
    @Override
    public double calcAmount() {
        return hours * costPerHour * 8;
    }

    // Implementing display method
    @Override
    public void display() {
        System.out.println("Indigo - Total Amount: " + String.format("%.2f", calcAmount()));
    }
}

