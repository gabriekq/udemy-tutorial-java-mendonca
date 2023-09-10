package com.mendonca.part5;

import java.util.Arrays;


public class App1 {

	public static void main(String[] args) {
		
		int[] nums = {1, 10 , -26 , 4 ,8, 5};
		
		String[] names = {"z","a","t","w"};
		
		//Arrays.sort(nums);
		
		Arrays.sort(names);
       
		for(String name : names) {
			System.out.println(name);
		}

	}

}
