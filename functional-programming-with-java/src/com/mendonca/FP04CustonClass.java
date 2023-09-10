package com.mendonca;

import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

class Course{
	private String name;
	private String categoria;
	private int reviwScore;
	private int noOfStudants;
	
	
	
	
	public Course(String name, String categoria, int reviwScore, int noOfStudants) {
		super();
		this.name = name;
		this.categoria = categoria;
		this.reviwScore = reviwScore;
		this.noOfStudants = noOfStudants;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getReviwScore() {
		return reviwScore;
	}
	public void setReviwScore(int reviwScore) {
		this.reviwScore = reviwScore;
	}
	public int getNoOfStudants() {
		return noOfStudants;
	}
	public void setNoOfStudants(int noOfStudants) {
		this.noOfStudants = noOfStudants;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", reviwScore=" + reviwScore + ", noOfStudants=" + noOfStudants + "]";
	}
	
}


public class FP04CustonClass {

	public static void main(String[] args) {
		
	List<Course> courses =  	List.of(
				new  Course("Spring", "Framework", 98, 20000),
				new  Course("Spring Boot", "Framework", 98, 1200),
				new  Course("Api", "Framework", 91, 20000),
				new  Course("Microservices", "Framework", 30, 500),
				new  Course("Full Stack", "Framework", 98, 40000),
				new  Course("Azure", "Cloud", 50, 60000),
				new  Course("Full Stack", "Framework", 98, 4000)
				);
	
	 Predicate<? super Course> reviewScoreGreaterThan = course -> course.getReviwScore() > 95;
	 
	//System.out.println(  courses.stream().allMatch(reviewScoreGreaterThan));
	
	//System.out.println(  courses.stream().noneMatch(reviewScoreGreaterThan));
	 
	 Comparator<Course> comparatorCourse = new Comparator<Course>() {
		
		@Override
		public int compare(Course o1, Course o2) {
			
			if(o1.getReviwScore() < o2.getReviwScore() ) {
				return -1;
			}
			
			if(o1.getReviwScore() > o2.getReviwScore() ) {
				return 1;
			}
			
			
			return 0;
		}
	}; 
	 
	Comparator<Course> comparatorStudants1Incriseling = Comparator.comparing(Course::getNoOfStudants  );
	
	Comparator<Course> comparatorStudants1Decrisiling = Comparator.comparing(Course::getNoOfStudants  ).thenComparing(Course::getReviwScore)   .reversed();
	
	
	//courses.stream().sorted(comparatorStudants1Decrisiling).forEach( course -> System.out.println(course));;
	
	// courses.stream().sorted(comparatorStudants1Decrisiling).limit(5).forEach( course -> System.out.println(course));;
	
//	courses.stream().sorted(comparatorStudants1Decrisiling).skip(3).forEach( course -> System.out.println(course));;
	
	// courses.stream().takeWhile(c -> c.getReviwScore() >= 98 ).forEach(c -> System.out.println(c));
	 
	//courses.stream().dropWhile(c -> c.getReviwScore() >= 98 ).forEach(c -> System.out.println(c));
	
  //  System.out.println(	courses.stream().min(comparatorStudants1Decrisiling).get());

	
	// System.out.println(	courses.stream().findFirst()  );
	 
	// System.out.println(	courses.stream().findAny( )  );
	
//	System.out.println(	courses.stream().filter(reviewScoreGreaterThan).mapToInt(   course -> course.getNoOfStudants()).count()   );
	
	//System.out.println( courses.stream().collect(Collectors.groupingBy(Course::getCategoria)));
	
//	System.out.println( courses.stream().collect(Collectors.groupingBy(Course::getCategoria, Collectors.maxBy( Comparator.comparing(Course::getReviwScore)  )   )));
	
	//System.out.println( courses.stream().collect(Collectors.groupingBy(Course::getCategoria, Collectors.mapping(Course::getName, Collectors.toList())   )));
	
//	IntStream.range(1, 10).forEach(n ->  System.out.print(n));
	
	// IntStream.iterate(1, n -> n+1).filter( n -> n%2 ==0 ).limit(10).forEach(n ->  System.out.println(n));
   
  // System.out.println(  	LongStream.rangeClosed(1L, 80).mapToObj(BigInteger::valueOf ).reduce(BigInteger.ONE,  BigInteger::multiply ));
	
	 System.out.println("javaTare".split("").length  );
	
	

	}

}
