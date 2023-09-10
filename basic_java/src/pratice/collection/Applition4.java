package pratice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Applition4 {

	public static void main(String[] args) {
		
       HashSet<Employee> hashSet = new  HashSet();
       hashSet.add(new Employee("Mike", 3500, "acounting")  );
       hashSet.add(new Employee("Poul", 3000, "Admin")  );
       hashSet.add(new Employee("Peter", 7500, "IT")  );
       hashSet.add(new Employee("Angel", 5500, "Maint")  );
       hashSet.add(new Employee("Steve", 2000, "acounting")  );
       hashSet.add(new Employee("Mike", 1500, "acounting")  );
       
 
       ArrayList<Employee> myList = new ArrayList<Employee>(hashSet);

       Collections.sort(myList);
       
		System.out.println(myList);
	}

}
