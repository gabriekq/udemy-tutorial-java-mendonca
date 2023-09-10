package pratice.threading;

public class Application2 {

	public static void main(String[] args) {
		
		Sequence sequence = new Sequence();
		
	   Worker worker = new Worker(sequence);

	   Worker worker2 = new Worker(sequence);
	    worker2.start();
	   worker.start();
	  
	   
	}

}
