package com.medonca;

public class Animal {

    int age;
    String gender;
    int weightInLbs;

	
	
	
	public Animal(int age, String gender, int weightInLbs) {
		super();
		this.age = age;
		this.gender = gender;
		this.weightInLbs = weightInLbs;
	}


	public void eat() {	
	   System.out.println("Eating...");	
	}
	
	public void sleep() {
		System.out.println("Spleeping...");
	}
	
	
	
	
}
