package pratice.threading;


public class Task extends Thread  {

	public Task(String threadName ) {
	 setName(threadName);
	
	}
	
	@Override
	public void run() {
		
		for (int index=0;index<100000;index++) {
		System.out.println("Gabriel  "+index+" - "+Thread.currentThread().getName());
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}

    

	
}
