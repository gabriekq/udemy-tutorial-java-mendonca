package com.mendonca.part4;

import java.util.HashSet;
import java.util.Set;

public class App3 {

	public static void main(String[] args) {
		
		
		HashSet<String> set = new HashSet<>();
		
		set.add("Gabriel");
		set.add("joao");
		set.add("mario");
		set.add("Ana");
	
		Set<String> set2 = new HashSet<>();
		
		set2.add("Gabriel");
		set2.add("Ana");
	
		set.retainAll(set2);
		
		for(String name : set2) {
			System.out.println(name);
		}
		
	

	}

}
