package com.mendonca.part2;

import java.util.ArrayList;
import java.util.List;

public class LLibrary <T extends Algorithm>{

	private List<T> algorithms;

	public LLibrary(){
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
