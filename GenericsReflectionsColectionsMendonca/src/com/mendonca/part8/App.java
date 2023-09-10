package com.mendonca.part8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		
		int [] nums = {1,5,3,-2,9,12};
		
	
	      //Arrays.stream(nums).forEach( (value) ->System.out.println(value)  );
		
	     int sum = Arrays.stream(nums).sum();
	   //  System.out.println(sum);
	     
    //   IntStream.range(0, 10).forEach((value) ->System.out.println(value+" "));
	     
     //  IntStream.range(0, 10).filter( val -> val % 2 ==0).forEach((value) ->System.out.println(value+" "));
	     
        String[] names = {"Adam","Daniel","Martha","Kevin","Ben","Brad","Susan"};
       
     //   Stream.of(names).sorted(Comparator.reverseOrder()).forEach((name) -> System.out.println(name));
       
   //     Stream.of(names).filter((value) -> value.startsWith("B")).forEach((name) -> System.out.println(name));
        
        List<Book> books = new ArrayList<>();
    	books.add(new Book("Being and Time", "Heidegger", 560, Type.PHILOSOPHY));
		books.add(new Book("The Trial", "Franz Kafka", 240, Type.NOVEL));
		books.add(new Book("Death on The Nile", "Agatha Christie", 370, Type.THRILLER));
		books.add(new Book("Ancient Greece", "Robert F.", 435, Type.HISTORY));
		books.add(new Book("Ancient Rome", "Robert F.", 860, Type.HISTORY));
		books.add(new Book("Death of Virgil", "Hermann Broch", 590, Type.NOVEL));
		books.add(new Book("The Stranger", "Albert Camus", 560, Type.NOVEL));
        
	//	books.stream().forEach(System.out::println);
		
	/*
	 * List<Book> booksLis = books.stream() .filter( (t) -> t.getType() ==
	 * Type.NOVEL) .sorted( ( o1, o2) -> o1.getTitle().compareTo(o2.getTitle() ) )
	 * .collect(Collectors.toList());
	 */
	     
	     
		List<String>  booksLis =	books.stream()
	    		 .filter( (t) -> t.getType() == Type.NOVEL)
	    		 .sorted( Comparator.comparing( (Book f) ->  f.getPage()    ))
	    		 .map( t -> t.getTitle() )
	    		 .collect(Collectors.toList());
	     
	     System.out.println(booksLis);
		
	   //  booksLis.forEach(System.out::println);
		
        //Stream<Book> nameStem  = books.stream();
        
       // books.stream().forEach((name)-> System.out.println(name) );
       // books.stream().forEach((name)-> System.out.println(name) );
        
       
	}

}
