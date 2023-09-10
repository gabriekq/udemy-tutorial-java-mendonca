package pratice.threading;

public class Application3 {

	public static void main(String[] args) throws InterruptedException {
		
		InventoryManager manager = new InventoryManager();
		
		Thread invntoryTask = new Thread(new Runnable() {
		
			@Override
			public void run() {
					manager.populateSoldProducts();
			}
		});
		
		
		Thread   diplayTask = new Thread(new Runnable() {
			
			@Override
			public void run() {
					manager.displaySoldProduct();
			}
		});
		
		
		invntoryTask.start();
         Thread.sleep(3000);
		diplayTask.start();

	}

}
