package pratice.generics;

import java.util.ArrayList;
import java.util.List;

public class Application2 {

	public static void main(String[] args) {
		
		Object myObject = new Object();
		String myVar = "hello";
		myObject = myVar;
		
		
		Employee employee = new Employee();
		Accountant acc = new Accountant();
		employee = acc;
	
		
		ArrayList<Employee> employees = new  ArrayList<>();
		employees.add(new Employee());
		
		
		ArrayList<?> employees2 = new  ArrayList<>();
		ArrayList<Accountant> accountants = new  ArrayList<>();
		accountants.add( new Accountant());
		
		employees2 = accountants;
		
		// uper Bound
		ArrayList<? extends Employee> employees3 = new ArrayList<>();
		ArrayList<Accountant> accountant3 = new ArrayList<>();
		employees3 = accountant3;
		
		// lowwer bound
		ArrayList< ? super Employee> emploees4 = new ArrayList<>();
		ArrayList<Object> accountant4 = new ArrayList<>();
		emploees4 = accountant4;
		
		makeEmployeeWork(accountants);

	}
	
	public static void makeEmployeeWork(List<? extends Employee> employees) {
		for(Employee employee :  employees ) {
			employee.work();
	    }

    }
	
}
