package com.mendonca.part3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>(10);
		
		names.add("Kevin");
		names.add("Adam");
		names.add("Ana");

	//	System.out.println(names.get(0));
		
		names.add(0, "Daniel");
		names.remove(0);
		
		System.out.println(names.contains("Kevin"));
		
		Object[] objects = names.toArray();
		
		for(Object name : objects) {
			System.out.println(name);
		}
	
	
		reverse(List.of(1, 2, 3, 4));
	
	
	}
	
	  public static void reverse(List<Integer> list) {  
		  list = list.stream().sorted(Comparator.reverseOrder()).toList(); 
		  System.out.println(list);
	 } 
	


}
