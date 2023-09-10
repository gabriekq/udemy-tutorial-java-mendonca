package pratice.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application3 {

	public static void main(String[] args) {
		
		LinkedHashSet<Animal> animals = new LinkedHashSet<>();
		animals.add( new Animal("macaco", 254));
		animals.add( new Animal("elefante", 7));
		animals.add( new Animal("cachorro", 77));
		animals.add( new Animal("gato", 4));
		animals.add( new Animal("boi", 14));
		animals.add( new Animal("boi", 14));
		
		System.out.println(new Animal("boi", 14).hashCode());
		
		for(Animal animal : animals) {
			
			System.out.println(animal);	
		}
		
		

	}

}
