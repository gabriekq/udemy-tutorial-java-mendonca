package pratice.threading2;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
	
		
		ArrayList<Integer> questionList = new ArrayList<>();
		
		Thread t1 = new Thread(new Producer(questionList));
		
		Thread t2 = new Thread(new Consumer(questionList));
		
		t1.start();
		t2.start();

	}

}
