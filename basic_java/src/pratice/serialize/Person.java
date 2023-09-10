package pratice.serialize;

import java.io.Serializable;

public class Person implements Serializable {

	private String fistName;
	private String lastName;
	private int age;
	private transient int id;
	
	public String getFistName() {
		return fistName;
	}
	
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Person [fistName=" + fistName + ", lastName=" + lastName + ", age=" + age + ", id=" + id + "]";
	}
	
	
	
	
}
