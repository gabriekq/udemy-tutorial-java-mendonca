package java_object;

public class Fish extends Animal {

	
	public Fish(String gender, int age, int weightInLbs) {
		super(gender, age, weightInLbs);
		
	}

	public void swim() {
		System.out.println("Swimming ... ");
	}

	@Override
	public void move() {
		System.out.println("Fish is moveing");
		
	}
	
	
	
	
}
