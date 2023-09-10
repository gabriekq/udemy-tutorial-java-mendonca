package pratice.threading;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {

	List<Product> soldProductList = new CopyOnWriteArrayList<Product>();
	List<Product> purchasedProductList = new CopyOnWriteArrayList<Product>();
	
	
	
	public void populateSoldProducts()  {
		
		for(int index=0;index<1000;index++) {
			Product prod = new Product(index, "test_product"+index);
			soldProductList.add(prod);
			System.out.println("Add: "+prod);
			try {
			  Thread.sleep(10);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	
	}
	
	public void displaySoldProduct()  {
		
		for(Product product : soldProductList ) {
			System.out.println("SOLD: "+product);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
}
