package ds.queue;

public class App {

	public static void main(String[] args) {
	
		Queue myQueue =  new Queue(5);
		myQueue.insert(5);
		myQueue.insert(99);
		myQueue.insert(84);
		myQueue.insert(30);
		myQueue.insert(27);
		
		myQueue.insert(27);
		myQueue.insert(27);
		myQueue.insert(27);
		myQueue.insert(27);
		
		myQueue.view();

	}

}
