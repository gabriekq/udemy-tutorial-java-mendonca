package com.mendonca.part8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App2 {

	public static void main(String[] args) {
		
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
		
		List<String> longestBooks = books
				.stream()
				.filter(p -> p.getPage() > 500 )
				.map(Book::getAuthor)
				.limit(2)
				.collect(Collectors.toList());
		
		longestBooks.stream().forEach(l ->  System.out.println(l));

	}

}
