package com.mendonca.part6;

import java.util.ArrayList;
import java.util.List;

public class Cache {

	
	private static final int CAPACITY=5;
	private List<Pair> cache;

	public Cache() {
		this.cache = new ArrayList<>();
	}
	
	public void search(String url) {
		Pair searchItem = null;
		
		for(Pair pair: cache) {
			if(pair.getUrl().equals(url)) {
				searchItem = pair;
			}	
		}
		
		if(searchItem!= null) {
			cache.remove(searchItem);
			cache.add(0,searchItem);
		}else {
			Pair newPair = new Pair(url, "random content for the giver url");
		    if(cache.size()>=CAPACITY) {
		    	cache.remove(CAPACITY-1);
		    }
		    
		    if(cache.size()==0) {
		    	cache.add(newPair);
		    }else {
		    	cache.add(0,newPair);
		    }  
		}
	}
	
	
	public void showCache() {
		for(Pair pair : cache) {
			System.out.println(pair);
		}
	}
	
	
}
