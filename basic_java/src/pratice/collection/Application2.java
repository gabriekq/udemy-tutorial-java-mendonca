package pratice.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Application2 {

	public static void main(String[] args) {
		
		ArrayList<String> animals = new ArrayList<>();
		
		animals.add("Lion");
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Bird");
		
		/*
		 * for(int index=0;index<animals.size();index++) {
		 * 
		 * System.out.println(animals.get(index));
		 * 
		 * }
		 * 
		 * 
		 * for(String value : animals) { System.out.println(value); }
		 */
		
		ArrayList<Vehicle> vehicles = new ArrayList<>(1000);
		vehicles.add(new Vehicle("Honda", "Acord", 12000, false));
		vehicles.add(new Vehicle("GOL", "VW", 18000, false));
		vehicles.add(new Vehicle("BMW", "M3", 32000, false));
		vehicles.add(new Vehicle("Fusca", "VW", 2000, false));
		vehicles.add(new Vehicle("Honda", "CG", 12000, false));
		
	//	for(Vehicle vehicle :vehicles ) {
			
		//	System.out.println(vehicle);
			
			
	//	}
		
		printElements(vehicles);
		printElements(animals);
		
		
	}
	
	public static void printElements(List someList) {
		  for(int index=0;index<someList.size();index++) {
			 
			  System.out.println(someList.get(index));
			  
			  }
	}
	

}
