package com.luv2code.springdemo.derin;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private String operatingSystem;
	
	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	
	public Student() {
		countryOptions = new LinkedHashMap<>();
		favoriteLanguageOptions = new LinkedHashMap<>();
		countryOptions.put("NG", "Nigeria");
		countryOptions.put("US", "United States of America");
		countryOptions.put("CA", "Canada");
		countryOptions.put("IN", "India");
		countryOptions.put("ES", "SPAIN");
		countryOptions.put("BR", "Brazil");
		countryOptions.put("DE", "Germany");
		
		favoriteLanguageOptions.put("Java", "Java");
        favoriteLanguageOptions.put("C#", "C#");
        favoriteLanguageOptions.put("PHP", "PHP");
        favoriteLanguageOptions.put("Ruby", "Ruby");
		
		
		/* The code below keeps generating a null line along with valid lines from the 
		 * countryList.txt file, thus breaking the code. I have to look into this.
		 * 
		 * For now, I have to complete my daily goal.
		 * 
		 * To use the file input uncomment the comments below, and comment out the countryOptions
		 * assignments above
		 */
		
//		File textReader = new File("/Users/derin/Development/Java Projects/spring-mvc-demo/src/countryList.txt");
//		BufferedReader bufferedReader = new BufferedReader(new FileReader(textReader)); 
//		ArrayList<String> arrayLoader = new ArrayList<String>();
//		while (bufferedReader.readLine() != null)
//			arrayLoader.add(bufferedReader.readLine());
//		bufferedReader.close();
//		for (String rdr : arrayLoader)
//			System.out.println("Checking Loaded Countries: " + rdr);
//		countryOptions = loadCountries(arrayLoader);
//		System.out.println("Printing countryOptions: " + countryOptions);
		
	}
	
//	private LinkedHashMap<String, String> loadCountries(ArrayList<String> arrayLoader) {
//		LinkedHashMap<String, String> tempLoader = new LinkedHashMap<>();
//		for (String country : arrayLoader){
//			String[] tempArr = country.split(" ");
//			System.out.println("Before setting the List code is: " + tempArr[1] + " Country is: " + tempArr[0]);
//			tempLoader.put(tempArr[1], tempArr[0]);
//		}
//		return tempLoader;
//	}

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
	
}
