package pratice.labdas2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Application2 {

	public static void main(String[] args) {
		
		IntStream.range(1, 10).skip(5).forEach( number -> System.out.println(number)  );
		
		int vall = IntStream.range(1, 5).sum();
		System.out.println(vall);
		
		
		Stream.of("Hello","bottle","Africa")
		.sorted().findFirst().ifPresent( (x) -> System.out.println(x)  );
		
		String [] items = {"car", "computer", "toothpast","box","pencill","tent", "door","toy" };
		
		Stream.of(items)
		.filter( (x) -> x.startsWith("t")  )
		.sorted()
		.forEach(x ->  System.out.println(x) );
		
		Arrays.stream(new int[] {2,4,6,8,10}   )
		      .map( (x) -> x*x    )
		      .average()
		      .ifPresent(n -> System.out.println(n) );
		
		List<String> listOfItems = Arrays.asList("Computer","Toothpaste","Box","Pencil");
		listOfItems.stream()
		           .map(x -> x.toLowerCase() )
		           .filter(x -> x.startsWith("c") )
		           .sorted()
		           .forEach(x -> System.out.println(x));
		
		
		
		

	}

}
