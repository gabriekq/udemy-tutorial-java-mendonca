package java_object;

public class Bird extends Animal {


	public Bird(String gender, int age, int weightInLbs) {
		super(gender, age, weightInLbs);
		
	}

	@Override
	public void move() {
		System.out.println("Flapping wings");
		
	}


	
	
}
