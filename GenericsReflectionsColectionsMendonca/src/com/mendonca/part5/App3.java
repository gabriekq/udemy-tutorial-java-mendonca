package com.mendonca.part5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App3 {

	public static void main(String[] args) {
	
		
		List<Integer> nums = new ArrayList<>();
		
		nums.add(1);
		nums.add(21);
		nums.add(11);
		nums.add(81);
		nums.add(8);
		nums.add(87);
		nums.add(3);
		
		Collections.reverse(nums);
		
		// min and max
		System.out.println(Collections.min(nums));
		
	//	Collections.shuffle(nums);
		
	//	Collections.rotate(nums, 2);
		
		Collections.replaceAll(nums, 1, 100);
		
		
		System.out.println(nums);
		
		
		

	}

}
