package pratice.comparable;

public class Student implements Comparable<Student> {

	private int rollno;
	private String name;
	private int age;
	
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Student student) {
	
		if(this.getAge()  <  student.getAge()) {
			return -1;
		}
		
		if(this.getAge()  >  student.getAge()) {
			return 1;
		}
		
		if(this.getAge()  ==  student.getAge()) {
			return 0;
		}
		
	   return 0;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
}
