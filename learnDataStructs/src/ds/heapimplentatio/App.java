package ds.heapimplentatio;

public class App {

	public static void main(String[] args) {
		
		Heap newHeap = new Heap(10);
		
		newHeap.insert(10);
		newHeap.insert(35);
		newHeap.insert(42);
		newHeap.insert(88);
		newHeap.insert(85);
		
		newHeap.displayHeap();
		

	}

}
