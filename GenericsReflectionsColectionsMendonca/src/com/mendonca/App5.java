package com.mendonca;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App5 {

	
	
	public static void main(String[] args) {
		
         List<Integer> values = Arrays.asList(1,2,3,4,88,65,7,4);       
         print(values);
         
         List<Rectangle> rectangles = new ArrayList<>();
         rectangles.add(new Rectangle());
         drawAll(rectangles);
         
         // we can create like this
         List<? extends Number> list1 = new ArrayList<Integer>();
         List<? extends Number> list2 = new ArrayList<Double>();
         List<? extends Number> list3 = new ArrayList<Float>();
      
       //  showAll(Arrays.asList(12,33,55,44,88));
         
         System.out.println(sumAll(Arrays.asList(1,2.40f,3,5)));
         
        
         List<? super Integer > list12 = new ArrayList<Number>();
         List<? super Integer > list13 = new ArrayList<Object>();
         
         List<Serializable> listSe = new ArrayList<>();
         listSe.add("Ana");
         listSe.add(1);
         listSe.add("joao");
         displayAll(listSe);
         
         List<? super Number > nums = new ArrayList<Number>();
         nums.add(25);
         nums.add(25.00);
         nums.add(25.02f);
         
         List<String> list = Arrays.asList("Adam","A","joao");
         
         List<String> list2C = new ArrayList<>();
         copy(list, list2C);
         System.out.println(list2C);
         
	}

	public static void print(List<?> objects ) { 
		
		for(Object object : objects  ) {
			System.out.println(object);
		}
	}
	
	public static  <T extends Shape >  void drawAll(List<T> shapes  ) {
		
		for(T shape   :shapes) {
			shape.draw();
		}	
	}
	
	public static void showAll(List<? extends Number> list ) {
		
		for(Number number: list) {
			System.out.println(number);
		}

	}
	
	public static double sumAll(List<? extends Number> list ) {
		double sum=0;
		
		for(Number number: list) {
			sum = sum + number.doubleValue();
		}
			
		return sum;
		
	}
	
	
    public static void displayAll  (List<? super Number> list) {
    	
    	for(Object num : list) {
    		System.out.println(num);
    	}
    }
	
    public static <T> void copy(List<? extends  T> source, List<? super T> destination) {
    
    	for(int index=0;index <source.size();index++) {
    		destination.add(source.get(index));
    	}
    	
    }
	
	
	
}
