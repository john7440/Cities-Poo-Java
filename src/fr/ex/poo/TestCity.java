package fr.ex.poo;

public class TestCity {

	public static void main(String[] args) {
		
		// test instance of different cities
		City Toulouse = new City("France", "Toulouse", 450000);
		City Annecy = new City("France", "Annecy", 131000);
		City Rabat = new City("Rabat", 577000);
		
		// Test display method
		Toulouse.display();
		Annecy.display();
		Rabat.display();
		
		// Test print method
		System.out.println(Toulouse);
		
		// Test ID 
		System.out.println(Rabat.getId());	

	}

}
