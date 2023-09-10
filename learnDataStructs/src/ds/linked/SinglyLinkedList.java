package ds.linked;

public class SinglyLinkedList {

	private Node first;
	private Node last;
	
	
	public SinglyLinkedList() {
		
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	// use to insert at the begin
	
	public void insertFirst(int data) {
		
		Node newNode = new Node();
		newNode.data = data;
		
		if(last == null) {
			last = newNode;
			last.next = null;
		}
		
		newNode.next = first;
		first = newNode;
		
	}
	
	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		return temp;
	}
	
	// display list here continuar
	public void displayList() {
		System.out.println("List(First --> last)");
		Node current = first;
		while(current != null) {
			current.displayNode();
			current = current.next;
		}
	}
	
	public void insertLast(int data) {
		Node current = first;
		while(current.next != null) {
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
		
	}
	
	public void insertLast2(int data) {
		
		Node newNode = new Node();
		newNode.data = data;
		
		last.next = newNode;
		last = newNode;
		
	}
	
	
}
