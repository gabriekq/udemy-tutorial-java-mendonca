package pratice.threading;

public class Application {

	public static void main(String[] args) {
		
		System.out.println("Starting thread 1");
		Task task = new Task("A");
		//task.setName("Thread A");
	 	task.start();
	
		
		System.out.println("Starting thread 2");
		Task task2 = new Task("B");
		//task2.setName("Thread B");
		task2.start();
		

	}

}
