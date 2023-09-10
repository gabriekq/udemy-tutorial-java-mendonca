package com.mendonca;

public class App2 {

	public static void main(String[] args) {
		
		
		GenericMethod method = new GenericMethod();
	System.out.println(method.showItem("Hello worlld"));
		
	System.out.println(method.showItem('H'));
		
	System.out.println(method.showItem(34));
		
	method.printItems("ABC", 123456);
		
		
		Integer[] nums = {1,2,3,4,5,6,7,8,9};
		
		String[] names = {"joao","carlos","Daniel"};
		
		
		String value1 = "Gabriel", value2="Gabriel"  ;
		
		Integer value4 =  5 , value5=5  ;
		
		System.out.println(method.checkEquality(value4,value5 ));
		
		

	}

}
