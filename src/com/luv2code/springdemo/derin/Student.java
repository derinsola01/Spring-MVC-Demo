package com.luv2code.springdemo.derin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {

	private String firstName;
	
	@NotNull(message="Field cannot be empty.")
	@Size(min=3, message="Must have at least 3 Characters.")
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private String operatingSystem;
	
	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	private LinkedHashMap<String, String> operatingSystemOptions;
	
	public Student() throws IOException {
		
		// create new field object instance
		countryOptions = new LinkedHashMap<>();
		favoriteLanguageOptions = new LinkedHashMap<>();
		operatingSystemOptions = new LinkedHashMap<>();
		
		// populate Countries
//		countryOptions.put("NG", "Nigeria");
//		countryOptions.put("US", "United States of America");
//		countryOptions.put("CA", "Canada");
//		countryOptions.put("IN", "India");
//		countryOptions.put("ES", "SPAIN");
//		countryOptions.put("BR", "Brazil");
//		countryOptions.put("DE", "Germany");
		
		// populate Programming Languages
		favoriteLanguageOptions.put("Java", "Java");
        favoriteLanguageOptions.put("C#", "C#");
        favoriteLanguageOptions.put("PHP", "PHP");
        favoriteLanguageOptions.put("Ruby", "Ruby");
        
     // populate Operating Systems
        operatingSystemOptions.put("Windows", "WINDOWS");
        operatingSystemOptions.put("Mac", "DARWIN");
        operatingSystemOptions.put("Linux", "LINUX");
        operatingSystemOptions.put("Ubuntu", "UBUNTU");
		
		
		/* The code below keeps generating a null line along with valid lines from the 
		 * countryList.txt file, thus breaking the code. I have to look into this.
		 * 
		 * For now, I have to complete my daily goal.
		 * 
		 * To use the file input uncomment the comments below, and comment out the countryOptions
		 * assignments above
		 */
		
		File textReader = new File("/Users/derin/Development/Java Projects/spring-mvc-demo/src/countryList.txt");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(textReader)); 
		ArrayList<String> arrayLoader = new ArrayList<String>();
		while (bufferedReader.readLine() != null)
			arrayLoader.add(bufferedReader.readLine());
		bufferedReader.close();
		for (String rdr : arrayLoader)
			System.out.println("Checking Loaded Countries: " + rdr);
		countryOptions = loadCountries(arrayLoader);
		System.out.println("Printing countryOptions: " + countryOptions);
		
	}
	
	private LinkedHashMap<String, String> loadCountries(ArrayList<String> arrayLoader) {
		LinkedHashMap<String, String> tempLoader = new LinkedHashMap<>();
		for (String country : arrayLoader){
			if (country != null) {
				String[] tempArr = country.split(" ");
				System.out.println("Before setting the List code is: " + tempArr[1] + " Country is: " + tempArr[0]);
				tempLoader.put(tempArr[1], tempArr[0]);
			}
		}
		return tempLoader;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public void setFavoriteLanguageOptions(LinkedHashMap<String, String> favoriteLanguageOptions) {
		this.favoriteLanguageOptions = favoriteLanguageOptions;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public LinkedHashMap<String, String> getOperatingSystemOptions() {
		return operatingSystemOptions;
	}

	public void setOperatingSystemOptions(LinkedHashMap<String, String> operatingSystemOptions) {
		this.operatingSystemOptions = operatingSystemOptions;
	}	
}
