package com.mendonca.part3;

import java.util.LinkedList;
import java.util.Queue;

public class App4 {

	public static void main(String[] args) {
	
		
		Queue<String> queue = new LinkedList<>();

		queue.add("Joao");
		queue.add("Carlos");
		queue.add("Mario");
		queue.add("Felipe");
		
	
	
		while(!queue.isEmpty()) {
			System.out.println(queue.remove());
		}
		
		
		
	}
	

	


}
