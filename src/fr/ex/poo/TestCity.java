package fr.ex.poo;

public class TestCity {

	public static void main(String[] args) {
		
		// test instanciations
		City Toulouse = new City("France", "Toulouse", 450000);
		City Annecy = new City("France", "Annecy", 131000);
		
		//display
		Toulouse.display();
		Annecy.display();
		
		//test changements 
		Toulouse.setNumberOfCitizen(370000);
		
		Toulouse.display();
		
		

	}

}
