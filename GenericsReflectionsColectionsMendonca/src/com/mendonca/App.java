package com.mendonca;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
	Store<String> store = new Store();
	store.setItem("Hello");
	 // integer
     String item =  store.getItem();
	// System.out.println(item);
		
	 
          Hashtable<String,Integer> hashtable = new Hashtable("Hello", 23);
          System.out.println(hashtable);
	 
          Hashtable<Integer,Integer> hashtable2 = new Hashtable(21, 23);
          System.out.println(hashtable2);
	 

	}
	
	


	
	

}
