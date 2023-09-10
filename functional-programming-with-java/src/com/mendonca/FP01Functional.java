package com.mendonca;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 12, 15);
		List<String> courses = List.of("spring", "spring boot", "API", "Microservices", "AWS", "Azure","Doker");
		
	//	printSpringInListFuctional( courses);
		
		//printLeast4InListFuctional(courses);
		//printAllNumbersInListFuctional(List.of(12, 9, 13, 4, 12, 15));

		printSquereEvenNumbersInListFuctional(numbers);
		
		
	//	printEvenNumbersInListFuctional(numbers);
		//printOddNumbersInListFuctional(numbers);
	}
	
//	private static void print(int number) {
//		System.out.println(number);
	//}
	

	private  static boolean isEven(int number) {
		
	return 	number % 2 == 0 ;
		
	}
	
	

	private static void printAllNumbersInListFuctional(List<Integer> numbers) {
        numbers.stream().forEach( System.out::println); 
	}
	
	private static void printEvenNumbersInListFuctional(List<Integer> numbers) {
        numbers.stream()
      //  .filter( n ->  isEven(n))
        .filter(n -> n%2==0  )
        .forEach( System.out::println); 
	}
	
	
	private static void printOddNumbersInListFuctional(List<Integer> numbers) {
        numbers.stream()
      //  .filter( n ->  isEven(n))
        .filter(n -> n%2!=0  )
        .forEach( System.out::println); 
	}
	
	private static void printSpringInListFuctional(List<String> courses) {
		courses.stream()
      //  .filter( n ->  isEven(n))
        .filter( word ->  word.contains("spring")  )
        .forEach( System.out::println); 
	}
	
	private static void printLeast4InListFuctional(List<String> courses) {
		courses.stream()
      //  .filter( n ->  isEven(n))
        .filter( word ->  word.length() >=4  )
        .forEach( System.out::println); 
	}
	
	
	
	private static void printSquereEvenNumbersInListFuctional(List<Integer> numbers) {
        numbers.stream()
      //  .filter( n ->  isEven(n))
        .filter(n -> n%2==0  )
        .map( valor -> Math.pow(valor, 2))
        .forEach( System.out::println); 
	}
	
	
	
	
	

}
