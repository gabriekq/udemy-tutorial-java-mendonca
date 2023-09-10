package com.mendonca.part3;

import java.util.Stack;

public class App3 {

	public static void main(String[] args) {
	
		Stack<String> names = new Stack<>();
		
		names.push("Gabriel");
		names.push("Ana");
		names.push("Daniel");
		names.push("Joao");
		names.push("Carlos");
		
	//	System.out.println(names.pop());
	//	System.out.println(names.pop());
		
		while(!names.isEmpty()) {
			System.out.println(names.pop());
		}
		
		
		
	}
	

	


}
