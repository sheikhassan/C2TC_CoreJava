package com.tns.daythree;

public class City extends State{
	
	public String cityName;
	
	public float area;
	
	public String getCityName() {
		return cityName;
	}
	
	public void setCityName(String CITY) {
		this.cityName = CITY;
	}
	
	public float getArea() {
		return area;
	}
	
	public void setArea(float AREA) {
		this.area = AREA;
	}
	
	@Override
	
	public String toString() {
		return "City[ cityName = " + cityName + ", area = " + area + ", stateName" + getStateName() + ", lang" + getLang() + ", CountryName = " + getCountryName() + ", Capital = " + getCapital() + "]";
	}

}
