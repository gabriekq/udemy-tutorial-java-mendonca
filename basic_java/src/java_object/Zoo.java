package java_object;

public class Zoo {

	public static void main(String[] args) {
	
	 //   Animal sparrow2 = new Sparrow("M", 10, 200);
	 //   Animal fish1 = new Fish("M", 10, 800);
	
	  //  moveAnimal(sparrow2);
	 //   moveAnimal(fish1);
		
		Flyable flyinBird = new Sparrow("M", 12, 1125);
		flyinBird.fly();
		
		
	    
	    
	    
	}

	
	public static void moveAnimal(Animal animal) {
		animal.move();
	}
	
	
	
	
}
