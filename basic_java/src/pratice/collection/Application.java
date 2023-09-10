package pratice.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {
		
		
		ArrayList<String> words = new ArrayList<>();
		words.add("Hello");
		words.add("There");	
		words.add("12");
		words.add("11");
		words.add("Q");

		String value =	 words.get(0);
		String value2 =  words.get(1);
	   
	     
	     System.out.println(value+value2);
	     
	     LinkedList<Integer> numbers = new LinkedList<Integer>();
	     numbers.add(100);
	     numbers.add(200);
	     numbers.add(45);
	     numbers.add(1000);
	     numbers.removeFirst();
	   
	     for(int number : numbers) {
	    	 System.out.println(number);
	     }
		
	}

}
