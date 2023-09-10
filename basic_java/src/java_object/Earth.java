package java_object;

public class Earth {

	
	public static void main(String args[]) {
		
		Human human1 = new Human("Tom", 25, 76, "Blue");
		Human human2 = new Human("Joe", 27, 80, "Yellow");
		
		Human human3 = new Human("Gabriel", 41, 60, "pink");
		
		human1.speak();
		human2.speak();
		human3.speak();
		
		
	}
	

	
}
