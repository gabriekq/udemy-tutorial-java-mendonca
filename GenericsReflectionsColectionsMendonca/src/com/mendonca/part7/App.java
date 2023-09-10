package com.mendonca.part7;

public class App {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class<Person> c = Person.class;	
		System.out.println(c.getName());
		
		
		Class personClass = null;
		personClass = Class.forName("com.mendonca.part7.Person");
		System.out.println(personClass.getName());
		
		checkClass(new Car());
		

	}
	
	public static void checkClass(Vehicle vehicle) {
		
		Class classVar = vehicle.getClass();
		System.out.println(classVar.getName());
	}
	
	

}
