package java_object;

public abstract class Animal {

	 String gender;
	 int age;
	 int weightInLbs;
	
	 public Animal(String gender, int age, int weightInLbs) {
		super();
		this.gender = gender;
		this.age = age;
		this.weightInLbs = weightInLbs;
	}
	 
	 
	 public void eat() {
		System.out.println("eating ...");
	}
	
	public void sleep() {
		System.out.println("sleeping ...");
	}

	public abstract void move();
	
	
	
	
}
