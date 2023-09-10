package pratice.threading;

public class Worker extends Thread {

	private Sequence sequence ;
	
	public Worker (Sequence sequence) {
		this.sequence = sequence;
	}
	
	
	
	@Override
	public  void  run() {
		
		for(int index=0;index<100;index++) {
			System.out.println(Thread.currentThread().getName()+"got value: "+sequence.getNext());
		     try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}
	
}
