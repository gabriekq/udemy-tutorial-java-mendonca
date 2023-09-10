package com.mendonca.part7;

import java.io.Serializable;

public class Person implements Comparable<Person>, Serializable {

	private String name;
	private int age;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@MyAnnotation(name="myAnnotation")
	public String returnName() {
		return this.name+" is the name";
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
