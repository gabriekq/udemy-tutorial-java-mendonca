package com.mendonca.part7;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class App1 {

	public static void main(String[] args) {
		
		Class<Person> personClass = Person.class;
		
		System.out.println(personClass.getPackage());
		
	//	Field[] fields = personClass.getFields();
		
	//	for(Field field  :fields) {
	//		System.out.println(field.getName());
	//	}
		
		
		Method[] methods = personClass.getMethods();
		
	//	for(Method method :methods) {
	//		System.out.println(method.getName()+" return type"+method.getReturnType());
	//	}
		
		Method[] fields = personClass.getDeclaredMethods();
		
		for(Method method : fields ) {
			method.setAccessible(true);
		     System.out.println(method.getName());
		}
		
		

	}

}
