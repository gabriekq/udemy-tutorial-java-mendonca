package com.mendonca.part7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App2 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {
		
		Constructor<Test> constructor = Test.class.getDeclaredConstructor();
		
		constructor.setAccessible(true);
		Test test = constructor.newInstance();
		Test test2 = constructor.newInstance();
		Test test3 = constructor.newInstance();
		
		System.out.println(test);
		
		System.out.println(test2);
		System.out.println(test3);
		
		Class<Person> personClass = null;
		
		/// Super clas
		personClass = (Class<Person>) Class.forName("com.mendonca.part7.Person");
		
		System.out.println(personClass.getSuperclass().getName());
		
		//// interfaces
		
		Class[] interfaces = personClass.getInterfaces();
		
		for(Class clas : interfaces) {
			System.out.println(clas.getName());
		}
		
		/// anotations
		Method[] methods = personClass.getMethods();
		
		for(Method method : methods ) {
			if(method.isAnnotationPresent(MyAnnotation.class)) {
				System.out.println(method.getName());
			}
		}

	}

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation{
	public String name();
}




