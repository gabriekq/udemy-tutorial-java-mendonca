package com.mendonca.part3;

import java.util.LinkedList;
import java.util.List;

public class App2 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>(); 
	
       list.add(1);
       list.add(10);
       list.add(5);
       list.add(3);
       list.add(41);
       
      list.addLast(85);
      list.addFirst(874);
      list.removeLast();
      
      System.out.println(list.isEmpty());
      
      System.out.println(list.size());
      
       for(Integer num : list) {
    	   System.out.println(num);
       }
	
	}
	

	


}
