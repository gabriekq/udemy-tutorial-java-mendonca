package com.mendonca;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03FuncionalInterfaces {

	public static void main(String[] args) {	
	List<Integer> numbers = List.of(12, 9 , 13, 4, 6,2,4,12,15);
	
	Predicate<? super Integer> isEventPredicate = x -> x%2==0;
	
	Function<? super Integer, ? extends Integer> squareFunction = x -> x*x;
	
	
	Consumer<Integer> action = n -> System.out.println(n);
	
	numbers.stream().filter(isEventPredicate )
	.map(squareFunction )
	.forEach(action);
	
	BinaryOperator<Integer> sunBinaryOperator = new BinaryOperator<Integer>() {
		
		@Override
		public Integer apply(Integer n1, Integer n2) {			
			    return n1+n2;
		      }
	       };
 
	       
	   int sum = numbers.stream().reduce(0, sunBinaryOperator); 
	   System.out.println("soma ->"+sum);
	       
	}

}
