package com.tns.daythree;

public class MultiLevelInheritance {
	
	public static void main(String[] args) {
		
		City mli = new City();
		
		mli.setStateName("Tamilnadu");
		
		mli.setCityName("chennai");
		
		mli.setArea(248.34f);
		
		mli.setLang("Tamil");
		
		mli.setCountryName("India");
		
		mli.setCapital("Delhi");
		
		System.out.println(mli);
		
	}

}
