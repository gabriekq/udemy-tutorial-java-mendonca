package com.mendonca.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App1 {

	public static <T> void copy(List<? extends T> source, List<? super T > destination ) {
		
		for(int index=0;index<source.size();++index) {
			destination.add(source.get(index));
		}
		
		FirstStore firstStore = new FirstStore();
		firstStore.setItem(new String("bom dia"));
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		List<Integer> list =  Arrays.asList(3,1,2,4,8,7);
		List<Integer> list2 = new ArrayList<>();
		copy(list,list2);
		System.out.println(list2);

	}

}
