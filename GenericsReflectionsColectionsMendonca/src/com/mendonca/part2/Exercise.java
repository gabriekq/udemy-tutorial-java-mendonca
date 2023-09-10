package com.mendonca.part2;

import java.util.*;

public class Exercise {

    public void runExercise() {
        
        // you have to implement the other classes such that the following code can run without any error
        
        Library<Algorithm> library = new Library<>();
		library.add(new SearchAlgorithm());
		library.add(new SortingAlgorithm());
		library.add(new GraphAlgorithm());
		
		Algorithm item = library.getLast();
		
		while(item!=null) {
			item.execute();
			item = library.getLast();
		}
    }
}

class SearchAlgorithm implements Algorithm  {

	@Override
	public void execute() {

			System.out.println("Running search algorithms...");
	}

}

class SortingAlgorithm implements Algorithm {

	@Override
	public void execute() {
		
		System.out.println("Running sorting algorithms...");
	}
	
}

class GraphAlgorithm implements Algorithm {

	@Override
	public void execute() {
		System.out.println("Running graph algorithms...");
		
	}

}

class Library <T extends Algorithm> {
	
	private List<T> algorithms;

public Library(){
	this.algorithms = new ArrayList();
}

public void add(T algorithm){
	this.algorithms.add(algorithm);
}

public T getLast(){
	if(algorithms.size()<=0){
		return null;
	}
	
	T actualItem = algorithms.remove(algorithms.size()-1);
	return actualItem;
}


}
