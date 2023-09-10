package adt.mendonca;

import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		
		Counter counter = new Counter("myCounter");
		counter.increment();
		counter.increment();
		counter.increment();
		counter.increment();
		
		System.out.println(counter.getCurrentValue());
		
		LinkedList<Counter> counters = new LinkedList<Counter>();

	}

}
