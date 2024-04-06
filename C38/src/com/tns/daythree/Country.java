package com.tns.daythree;

public class Country {
	
	public String countryName;
	
	public String capital;
	
	public String getCountryName() {
		return countryName;
	}
	
	public void setCountryName(String COUNTRYNAME) {
		this.countryName = COUNTRYNAME;
	}
	
	public String getCapital() {
		return capital;
	}
	
	public void setCapital(String CAPITAL) {
		this.capital = CAPITAL;
	}
	
	@Override
	
	public String toString() {
		
		return "Country[ countryName = " +  countryName + "capital" + capital + "]" ;
	}
	

}
