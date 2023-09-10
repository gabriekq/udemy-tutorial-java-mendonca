package com.mendonca.part5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App2 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Gabriel");
		list.add("Joao");
		list.add("Mario");
		list.add("Fernando");
		list.add("Angela");

		Collections.sort(list, Collections.reverseOrder());

	//	System.out.println(Collections.binarySearch(list, "Gabriel"));

	//	System.out.println(list);

		List<Book> books = new ArrayList<>();
		
		books.add(new Book("Joao", "abc", 500));
		books.add(new Book("Pequeno principe", "Mario", 250));	
		books.add(new Book("Rau", "titulo", 800));
		books.add(new Book("machado", "estado", 100));
		
		Collections.sort(books , new Book().reversed() );
		
	//	System.out.println(books);
		
		List<Person> peaple = new ArrayList<>();
		
		peaple.add(new Person("Gabriel", 33));
		peaple.add(new Person("Ana", 24));
		peaple.add(new Person("Joao", 1));
		peaple.add(new Person("Carlos", 54));
		
		Collections.sort(peaple, Comparator.comparing(Person::getAge).reversed()  );
			for(Person person :  peaple) {
			System.out.println(person);
		}
		

	}

}
