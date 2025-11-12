package fr.ex.poo;

public class City {

	//attributs
	private String country;
	private String cityName;
	private int numberOfCitizen;
	//ajout d'un id
	private int id;
	private static int nextId = 1;
	
	
	//COnstructeurs
	public City(String country, String cityName, int numberOfCitizen) {
		this.id = nextId++;
		this.country = country;
		this.cityName = cityName;
		this.numberOfCitizen = numberOfCitizen;
	}
	
	public City(String cityName, int numberOfCitizen) {
		this.id = nextId++;
		this.country = "Unknown";
		setCityName(cityName);
		setNumberOfCitizen(numberOfCitizen);
	}
	
	
	// accessseurs
	
	//ID
	public int getId() {
        return id;
    }
	
	//Country
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	//City
	public String getCityName() {
		return cityName;
	}
	
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	//Nb of citizen
	public int getNumberOfCitizen() {
		return numberOfCitizen;
	}
	
	public void setNumberOfCitizen(int numberOfCitizen) {
		if (numberOfCitizen < 0) {
			System.out.println("Il ne peut pas y avoir - de 0 habitants ! Valeurs par défaut mise à 0");
			this.numberOfCitizen = 0;
		} else {
			this.numberOfCitizen = numberOfCitizen;
		}
		
	}
	
	
	//méthodes
	public void display() {
		System.out.println(getCityName()+ " est une ville de " + 
						   getNumberOfCitizen() + " située en " + 
						   getCountry() );
	}
	
	// la méthode toString pour affichage avec print
	public String toString() {
		return getCityName() + " est une ville de " +
			   getNumberOfCitizen() + " située en " +
			   getCountry();
				
	}

}
