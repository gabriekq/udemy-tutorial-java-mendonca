package com.mendonca.part3;


import java.util.PriorityQueue;
import java.util.Queue;

public class App5 {

	public static void main(String[] args) {
	
		
      Queue<Person> queue = new  PriorityQueue<>();
      
      queue.add(new Person("joao", 25));
      queue.add(new Person("ana", 33));
      queue.add(new Person("Gabriel", 48));
      queue.add(new Person("Tiago", 90));
      queue.add(new Person("joao", 74));
		
      while(queue.peek() != null  ) {
    	  System.out.println(queue.poll());
      }
	
	}
	

	


}
