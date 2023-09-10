package com.mendonca.part4;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class App5 {

	public static void main(String[] args) {
	
		SortedSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());
		
		set.add(12);
		set.add(1);
		set.add(9);
		set.add(120);
		set.add(87);
		set.add(55);
		set.add(55);
		
		
		for(Integer num: set) {
			System.out.println(num);
		}
		

	}

}
