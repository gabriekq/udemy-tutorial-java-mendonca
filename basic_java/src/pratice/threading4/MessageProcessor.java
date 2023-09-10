package pratice.threading4;

public class MessageProcessor implements Runnable{

	private int message;

	public MessageProcessor(int message) {
		super();
		this.message = message;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"[Received :]"+message);
		respondToMessage();
		System.out.println(Thread.currentThread().getName()+"Done: "+message);
	}

	private void respondToMessage() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		
			System.out.println("Unable: "+message);
		}
		
	}
	
	
}
