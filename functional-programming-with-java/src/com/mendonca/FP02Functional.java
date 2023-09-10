package com.mendonca;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FP02Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6,2,4, 12,15);
		List<String> courses = List.of("spring", "spring boot", "API", "Microservices", "AWS", "Azure","Doker");
		
     List<Integer> numeros = doubleList(numbers);
	//numeros.stream().forEach( n -> System.out.println(n));

	 List<Integer> numerosEven = EvenList(numbers);
	 numerosEven.stream().forEach( n -> System.out.println(n));
	
	
	}

	
	private static List<Integer> doubleList(List<Integer> numbers) {
		
		return numbers.stream().map(n -> n*n  ).collect(Collectors.toList());
		
	
	}
	
private static List<Integer> EvenList(List<Integer> numbers) {
		
		return numbers.stream().filter(n -> n%2== 0 ).collect(Collectors.toList());
		
	
	}


	private static int sum(int a,int b) {
		System.out.println(a+" "+b);
		return a+b;
	}
	
	
	private static int addListFunctional(List<Integer> numbers) {
	
	//return	numbers.stream().reduce(0, (a,b) -> sum( a, b)  );
	return	numbers.stream().reduce(0, (a,b) -> a+b  );

	}

	
	private static int addListSquereFunctional(List<Integer> numbers) {
		
	return	numbers.stream().map(x -> x*x).reduce(0, (x,y) -> x+y );
		
	}


	private static int addListOddFunctional(List<Integer> numbers) {
		
		return	numbers.stream().filter(n -> n%2 !=0  ).reduce(0, (x,y) -> x+y );		
		}
	
	
    private static void addListDistinctFunctional(List<Integer> numbers) {
		
			numbers.stream().sorted().forEach(a ->  System.out.println(a));		
	}
	
    private static void addListSortedFunctional(List<String> courses) {
		
    	courses.stream().sorted(Comparator.comparing( str -> str.toString().length()  )  ).forEach(a ->  System.out.println(a));		
	}
    
    
    
    
	

}
