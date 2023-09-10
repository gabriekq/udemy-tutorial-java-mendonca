package com.mendonca.part9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.mendonca.part8.Book;
import com.mendonca.part8.Type;

public class App2 {

	public static void main(String[] args) throws IOException {
		
        List<Book> books = new ArrayList<>();
    	books.add(new Book("Being and Time", "Heidegger", 560, Type.PHILOSOPHY));
		books.add(new Book("The Trial", "Franz Kafka", 240, Type.NOVEL));
		books.add(new Book("Death on The Nile", "Agatha Christie", 370, Type.THRILLER));
		books.add(new Book("Ancient Greece", "Robert F.", 435, Type.HISTORY));
		books.add(new Book("Ancient Rome", "Robert F.", 860, Type.HISTORY));
		books.add(new Book("Death of Virgil", "Hermann Broch", 590, Type.NOVEL));
		books.add(new Book("The Stranger", "Albert Camus", 560, Type.NOVEL));
		
		Map<Type,List<Book>> booksByType = books.stream()
				.collect(Collectors.groupingBy(Book::getType));
			
	//	booksByType.entrySet().stream().forEach(e -> System.out.println(e) );
		
	/*
	 * List<String> longestBooks = books.stream().filter(p ->
	 * {System.out.println("Filter "+p.getTitle());return p.getPage() > 500;}
	 * ).map(b ->{System.out.println("Mapping "+b.getTitle()); return b.getTitle();
	 * }) .limit(2) .collect(Collectors.toList());
	 * 
	 * longestBooks.stream().forEach(l -> System.out.println(l));
	 */
		
		List<String> words = Arrays.asList("adam","ana","Daniel");
		
		List<Integer> wordsLenth  = words.stream().map(value -> value.length()).collect(Collectors.toList());
		System.out.println(wordsLenth);
		
		List<Integer> nums = Arrays.asList(1,2,3,4);
		
		List<Integer> wordsSquere =	nums.stream().map( value ->  value*value).collect(Collectors.toList());
		System.out.println(wordsSquere);
		
		String[] array = {"hello","shell"};
		
		List<String> letters = Arrays.stream(array)
		.map( value  -> value.split("")  )
		.flatMap(value -> Arrays.stream(value) )
		.distinct().collect(Collectors.toList());
		
		System.out.println(letters);
		
	    List<Integer> nums1 = Arrays.asList(1, 2, 3);
        List<Integer> nums2 = Arrays.asList(4, 5);
		
		// implement your algorithm here (the pairs will be the result)
        	List<List<Integer>> pairs = nums1.stream().flatMap(i -> nums2.stream().map(j -> Arrays.asList(i, j))).collect(Collectors.toList());
		    System.out.println(pairs);
		    
	  System.out.println(books.stream().count());
	  
	  List<Integer> numsV = Arrays.asList(1,2,3,4);
	  Optional<Integer> result = numsV.stream().reduce((vall,val) ->  Integer.max(vall, val)  );
		
	  result.ifPresent(value -> System.out.println(value));
	  
	  books.stream().map(boo -> boo.getPage()  ).reduce((vall,val) ->Integer.max(vall, val) ).ifPresent(res -> System.out.println(res)  );
	
	  Optional<Book> resultB =  books.stream().reduce((boo , boo2) ->boo.getPage() > boo2.getPage()   ?  boo : boo2);
	  System.out.println(resultB.get());
	  
	  int totalPages = books.stream().map( booksP -> booksP.getPage()  ).reduce((pages1, pages2  ) -> pages1+pages2  ).get();
	  System.out.println(totalPages);
	  
	  int stremInt =  books.stream().mapToInt(boos -> boos.getPage()).sum();
	   
	  OptionalInt bookFound = books.stream().mapToInt(boos -> boos.getPage()).max();
	  bookFound.ifPresent(value -> System.out.println(value));
	  
	  
	  boolean resultBMach = books.stream().allMatch(b -> b.getPage() > 2000  );
	  System.out.println(resultBMach);
	   
	  boolean resultNoneMach = books.stream().noneMatch(b -> b.getPage() > 2000  );
	  System.out.println(resultNoneMach);
	   
	   books.stream().filter( b -> b.getType() == Type.HISTORY).findAny().ifPresent(value -> System.out.println(value) );
	   
	   books.stream().filter( b -> b.getType() == Type.HISTORY).findFirst().ifPresent(value -> System.out.println(value) );
	   
	   
	   
	}

}
