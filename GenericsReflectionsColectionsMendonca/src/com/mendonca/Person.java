package com.mendonca;

public class Person implements Comparable<Person> {

	private int  age;
	private String name;
	
	
	
	
	
	
	
	@Override
	public int compareTo(Person person) {
		
		return Integer.compare(this.age,person.getAge());
		
		
		
		
	}


	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

	
	
	
	
	
	
	
}
