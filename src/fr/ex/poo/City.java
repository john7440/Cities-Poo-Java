package fr.ex.poo;

public class City {

	//attributs
	private String country;
	private String cityName;
	private int numberOfCitizen;
	
	//COnstructeur
	public City(String country, String cityName, int numberOfCitizen) {
		this.country = country;
		this.cityName = cityName;
		this.numberOfCitizen = numberOfCitizen;
	}
	
	//méthode
	public void display() {
		System.out.println(this.cityName + " est une ville de " + 
							this.numberOfCitizen + " située en " 
							+ this.country );
	}

}
