package com.mendonca;

import java.util.List;

public class App3 {

	public static void main(String[] args) {
			
		System.out.println(calculateMin("joao","Mario"));
			
		System.out.println(calculateMin(new Person(2,"Joao"), new Person(24,"Mario") ));
		
		System.out.println(add(25.58f, 45.8));
	   

		   
		  Integer[]  list =   {1, 2, 3, 4, 5};	   
		  int value = countGreaterItems(list , Integer.parseInt("3")  );
		  System.out.println(value);
		  
		  
		  String[]  list2 =   {"a", "b", "f", "d", "e"};	   
		  int value2 = countGreaterItems(list2 , "c"  );
		  System.out.println(value2);
		  
	}
	
	public static <T extends Comparable<T>> T calculateMin(T num1, T num2){
		
		if(num1.compareTo(num2)<0) {
			return num1;
		}
		
		return num2;
	}
	
	
	public static  <T extends Number >   double add(T num1,T num2) {
		return num1.doubleValue()+num2.doubleValue();
	}
	
	
	public static  <T extends Comparable<T>> int  countGreaterItems(T[] items, T item) {
		
		int result=0;
		
		for(T itemObjs :  items ) {
			
			if(itemObjs.compareTo(item) > 0 ) {
				result++;
			}	
			
		}
		
		return result;
	}
	
	
	
	
	

}
