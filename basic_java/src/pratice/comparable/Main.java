package pratice.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Student> studants=new ArrayList<Student>();
		
		Student studant1 = new Student(201, "Joao", 24);
		Student studant2 = new Student(902, "Joao", 54);
		Student studant3 = new Student(103, "Joao", 94);
		Student studant4 = new Student(0201, "Joao", 14);
		Student studant5 = new Student(0341, "Joao", 4);
		Student studant6 = new Student(1021, "Joao", 25);
		Student studant7 = new Student(801, "Joao", 2);
		
		studants.add(studant1);
		studants.add(studant2);
		studants.add(studant3);
		studants.add(studant4);
		studants.add(studant5);
		studants.add(studant6);
		studants.add(studant7);
		
		
		Collections.sort(studants);
		
		
		for(Student objStudant : studants) {
			System.out.println(objStudant);
			
		}

	}

}
