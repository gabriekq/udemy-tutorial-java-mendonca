package pratice.threading4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		Runnable processor = new MessageProcessor(2);
		executorService.execute(processor);
		
        Runnable processor2 = new MessageProcessor(44);
		executorService.execute(processor2);
		
        Runnable processor3 = new MessageProcessor(234);
		executorService.execute(processor3);
		
		  Runnable processor4 = new MessageProcessor(23334);
			executorService.execute(processor4);
		
		executorService.shutdown();
	   
		executorService.awaitTermination(2, TimeUnit.SECONDS);
			
			
		System.out.println("All submmit");
		
	}

}
