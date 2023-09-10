package com.mendonca;

import java.util.ArrayList;
import java.util.List;

public class App4 {

	public static void main(String[] args) {
			
		List<Bucket<String>> bukets = new ArrayList<>();		
		App4.addStore("Joao", bukets);	
		App4.<String>addStore("Carlos", bukets);
		
        List<Integer> list1 = add(new ArrayList<>(), 20,30);
        System.out.println(list1);

	}

	
	public static <T> void addStore(T t,List<Bucket<T>> list ){
		Bucket<T> bucket = new Bucket<>();
		bucket.setItem(t);
		list.add(bucket);
		System.out.println(t.toString()+" has been added to the list...");
	}
	
	
	public static <T> List<T> add(List<T> list, T item1, T item2  ){
		
		list.add(item1);
		list.add(item2);
		return list;
		
	}
	
	
	
	
}
