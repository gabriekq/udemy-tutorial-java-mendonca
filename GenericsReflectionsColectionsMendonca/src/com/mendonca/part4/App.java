package com.mendonca.part4;

import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		
		map.put(1,"Adam");
		map.put(2,"Kevin");
		map.put(3,"Ana");
		map.put(40,"Lucy");
		
		map.remove(2);
	  
		for( Map.Entry<Integer,String>  entry : map.entrySet()  ) {
	    	 System.out.println(entry.getKey()+"  "+entry.getValue());
	     }
		
		
		Map<String,Person> mapsPerson = new HashMap<>();
		
		mapsPerson.put("Adan", new Person("joao", 25));

	}

}
