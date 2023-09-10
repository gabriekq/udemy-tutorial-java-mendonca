package com.mendonca.part9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import com.mendonca.part8.Book;
import com.mendonca.part8.Type;

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
		
		 //  long start = System.currentTimeMillis();
		//   System.out.println(sum(Integer.MAX_VALUE));
		//  System.out.println("Time sequencial: "+(System.currentTimeMillis() - start) );
		
		 //  long startPara = System.currentTimeMillis();
		//  System.out.println(paralellSum(Integer.MAX_VALUE));
		//  System.out.println("Time Paralell: "+(System.currentTimeMillis() - startPara) );
		  
	    long startPara = System.currentTimeMillis();
		long valuesPriem =  IntStream.rangeClosed(2, Integer.MAX_VALUE/100).filter(value ->  isPrime(value) ).count();
		System.out.println("number of primes: "+valuesPriem);
		System.out.println("Time Paralell: "+(System.currentTimeMillis() - startPara) );
		
		
	    long startParalle = System.currentTimeMillis();
		long valuesPriemParallel =  IntStream.rangeClosed(2, Integer.MAX_VALUE/100).parallel().filter(value ->  isPrime(value) ).count();
		System.out.println("number of primes: "+valuesPriemParallel);
		System.out.println("Time Paralell: "+(System.currentTimeMillis() - startParalle) );
		
		
		

	}
	
	public static boolean isPrime(long num) {
		if(num <= 1) {
			return false;
		}
		
		if(num==2) {
			return true;
		}
		
		if(num %2 ==0) {
			return false;
		}
		
		long maxDivisor = (long) Math.sqrt(num);
		
		for(int index=3;index<=maxDivisor;index = index +2) 
			if(num%index==0) 
				return false;
			
		   return true;
	}
	
	
	private static long sum(long n) {
		return LongStream.rangeClosed(1, n).reduce( 0L ,Long::sum);
	}
	
	private static long paralellSum(long n) {
		return LongStream.rangeClosed(1, n).parallel().reduce( 0L ,Long::sum);
	}
	
	

}
