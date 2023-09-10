package java_object;

public class Sparrow  extends Bird implements Flyable {

	public Sparrow(String gender, int age, int weightInLbs) {
		super(gender, age, weightInLbs);
	
	}

	@Override
	public void fly() {
		System.out.println("Sparrow Flying ...");
		
	}

}
