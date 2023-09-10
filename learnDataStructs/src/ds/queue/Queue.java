package ds.queue;

public class Queue {

	private int maxSize; // int the set number of slots
	private long[] queArray; // slots to main the data
    private int front;    // this will be the index position for the front
    private int rear; // this is going to be the index in the back
	private int nItens;
	
	public Queue(int size) {
		this.maxSize = size;
		this.queArray = new long[size];
		front = 0;
		rear = -1;
		nItens = 0;
	}

	public void insert(long value) {
		
		if(rear == maxSize-1) {
			rear = -1;
		}
		
		rear++;
		queArray[rear] = value;
		nItens++;
	}
	
	public long remove() {
		long temp = queArray[front];
		front++;
		if(front == maxSize) {
			front = 0;
		}
		nItens --;
		return temp;
	}
	
	public long peekFront() {
		return queArray[front];
	}
	
	public boolean isEmpty() {
		return (nItens == 0);
	}
	
	public boolean isFull() {
		return (nItens == maxSize);
	}
	
	
	public void view() {
		System.out.print("[");
		for(int index=0;index < queArray.length;index++ ) {
			System.out.print(queArray[index]+" ");
		}
		System.out.print("]");
	}
	
	
}
