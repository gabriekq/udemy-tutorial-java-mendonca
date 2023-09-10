package pratice.generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class Application {

	public static void main(String[] args) {
	
		Container<Integer,String> container = new Container<>(123, "Hello0");
		
		int value =  container.getItem1();
		
		
		Set<Integer> mySet = new HashSet<>();
		mySet.add(1232222);
		mySet.add(9);
		mySet.add(12);
		
		Set<Integer> mySet2 = new HashSet<>();
		mySet2.add(12);
		mySet2.add(123);
		mySet2.add(22);
		
		Set<Integer> result = union(mySet, mySet2);


		Iterator<Integer> itr = result.iterator();
		
		while(itr.hasNext()) {		
			System.out.println(itr.next());		
		}
		
	}
	
	public static <E> Set<E> union(Set<E> set1, Set<E> set2  ) {
	
		Set<E> result = new HashSet<>(set1);
		result.addAll(set2);
			
		return result;	
	}
	
	

}
