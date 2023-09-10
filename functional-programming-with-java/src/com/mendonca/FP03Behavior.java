package com.mendonca;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FP03Behavior {

	public static void main(String[] args) {	
	List<Integer> numbers = List.of(12, 9 , 13, 4, 6,2,4,12,15);
	
	
	Predicate<? super Integer> evanPredicate = x -> x%2==0;
	//numbers.stream().filter(evanPredicate).forEach(x-> System.out.println(x)  );
	
	Predicate<? super Integer> oddPredicate = x -> x%2!=0;
	
	//filterAndPrint(numbers,x -> x%2!=0);
	
	// mapAndPrint(numbers, x-> x*x);
	
	Supplier<Integer> randonIntegerSupplier = () -> (int) (Math.random()*100) ;
	
//	System.out.println(randonIntegerSupplier.get());
	
	UnaryOperator<Integer> UnaryOperator = (x) -> 3 *x;
	//System.out.println(UnaryOperator.apply(3));
	
	BiPredicate<Integer, String> biPredicate = (number,str) -> {
		return number > 10;
	};
//	System.out.println(biPredicate.test(100, "bom dia"));
	
	BiFunction<Integer, String, String> biFunction = (number,str) -> {
		return number+" "+str;
	};
	//System.out.println(biFunction.apply(100, "bom dia"));
	
	BiConsumer<String,  String > biConsumer = (s1,s2) -> {
		System.out.println(s1);
		System.out.println(s2);
	};
	biConsumer.accept("100", "200");
	
	}
	
	public static void filterAndPrint(List<Integer> numbers,Predicate<? super Integer> predicate ) {
		numbers.stream().filter(predicate).forEach(x-> System.out.println(x)  );
	}
	
	public static void mapAndPrint(List<Integer> numbers,Function<Integer, Integer> function ) {
		numbers.stream().map(function).forEach(x-> System.out.println(x)  );
	}
	

}
