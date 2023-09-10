package com.mendonca.part3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class App6 {

	public static void main(String[] args) {
		
		
		/*
		 * Deque<Integer> queue = new ArrayDeque<>();
		 * 
		 * queue.offer(1); queue.offer(10); queue.offer(1000); queue.offer(10000);
		 * 
		 * while(!queue.isEmpty()) { System.out.println(queue.poll()); }
		 */
		
		Deque<Integer> stack = new ArrayDeque<>();

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		
	}

}
