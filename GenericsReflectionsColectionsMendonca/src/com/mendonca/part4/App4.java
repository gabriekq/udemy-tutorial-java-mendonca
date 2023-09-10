package com.mendonca.part4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class App4 {

	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet();
		
		set.add("Gabriel");
		set.add("Steve");
		set.add("Daniel");
		set.add("Ana");
		
		for(String name : set) {
			System.out.println(name);
		}

	}

}
