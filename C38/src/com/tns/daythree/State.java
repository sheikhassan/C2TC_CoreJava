package com.tns.daythree;

public class State extends Country {
	
	public String stateName;
	
	public String lang;
	
	public String getStateName() {
		return stateName;
	}
	
	public void setStateName(String STATENAME) {
		this.stateName = STATENAME;
	}
	
	public String getLang() {
		return lang;
	}
	
	public void setLang(String LANG) {
		this.lang = LANG;
	}
	
	@Override
	
	public String toString() {
		return "State[ stateName = " + stateName + ", Lang = " + lang + ", CountryName = " + getCountryName() + ", Capital = " + getCapital() + "]";
	}
}
