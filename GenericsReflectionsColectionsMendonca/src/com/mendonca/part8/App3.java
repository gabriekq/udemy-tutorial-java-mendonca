package com.mendonca.part8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class App3 {

	public static void main(String[] args) {
		
		
		    List<Book> books = new ArrayList<>();
			books.add(new Book("Being and Time", "Heidegger", 560, Type.PHILOSOPHY));
			books.add(new Book("The Trial", "Franz Kafka", 240, Type.NOVEL));
			books.add(new Book("Death on The Nile", "Agatha Christie", 370, Type.THRILLER));
			books.add(new Book("Ancient Greece", "Robert F.", 435, Type.HISTORY));
			books.add(new Book("Ancient Rome", "Robert F.", 860, Type.HISTORY));
			books.add(new Book("Death of Virgil", "Hermann Broch", 590, Type.NOVEL));
			books.add(new Book("The Stranger", "Albert Camus", 560, Type.NOVEL));
		
		//	List<Book> booksResult =  books.stream().filter((book) -> book.getTitle().split(" ").length == 2   ).collect(Collectors.toList());
		//    System.out.println(booksResult);
			
			List<String> titles = new ArrayList<>();
			
			Iterator<Book> interator = books.iterator();
	
			while(interator.hasNext()) {
				titles.add(interator.next().getTitle());
			}
	
			// stream API
			List<String> title2 = books.stream().map(Book::getTitle).collect(Collectors.toList());
			
			title2.forEach(e -> System.out.println(e));
		

	}

}
