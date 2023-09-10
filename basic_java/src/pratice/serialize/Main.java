package pratice.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		// create jar com the command line jar -cvfm myprogram.jar manifest.mf *.*
		
		Person person = new Person();
		person.setAge(24);
		person.setFistName("Gabriel");
		person.setLastName("Mendonca");
		person.setId(24242411); // value will not be record because its transient
		
		// Serialized
		FileOutputStream fileOutputStream = new FileOutputStream( new File("c:\\java-files\\person.ser"));
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(person);
	//	objectOutputStream.flush();
	//	fileOutputStream.flush();
		//Serialized end
		
		FileInputStream fileInputStream = new FileInputStream(new File("c:\\java-files\\person.ser"));
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Person personRead = (Person) objectInputStream.readObject();
		System.out.println(personRead);
		

	}

}
