package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	//private String country;
	
	private LinkedHashMap<String,String> countryOptions;
	
	private LinkedHashMap<String,String> favoriteLanguage;

    private String[] operatingSystems;
    
	
	//private String operatingSystem;
	
	//private String favoriteLanguage;
	
	/*
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	*/

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public Student() {
		
		//populate country options: used ISO country code
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BH","Bharat");
		countryOptions.put("BR","Brazil");
		countryOptions.put("MX","Mexico");
		countryOptions.put("US","USA");
		
		
		favoriteLanguage = new LinkedHashMap<>();
		favoriteLanguage.put("JV","Java");
		favoriteLanguage.put(".Net","C#");
		favoriteLanguage.put("PRL","Pearl");
		favoriteLanguage.put("PY","Python");
		
		/*
		operatingSystem = new LinkedHashMap<>();
		operatingSystem.put("W10","Windows10");
		operatingSystem.put("LX","Linux");
		operatingSystem.put("UB","Ubuntu");
		operatingSystem.put("KB","Kubuntu");
		*/
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public LinkedHashMap<String, String> getFavoriteLanguage() {
		return favoriteLanguage;
	}

	/*
	public LinkedHashMap<String, String> getOperatingSystem() {
		return operatingSystem;
	}

	
	
	
	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

    	*/
	
	
	
	
}
