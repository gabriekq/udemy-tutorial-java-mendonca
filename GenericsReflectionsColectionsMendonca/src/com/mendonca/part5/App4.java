package com.mendonca.part5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App4 {

	public static void main(String[] args) {
		
		
		List<Integer> nums = new ArrayList<>();
		
		nums.add(10);
		nums.add(20);
		nums.add(30);
        
		modify(nums);
		
		nums= Collections.unmodifiableList(nums);
		
		
		
		System.out.println(nums);
		
	}
	
	public static void modify(List<Integer> list) {
		
		list.remove(0);
		
	}
	
	
	

}
