package doublelinkedlist;

import java.awt.print.Book;

public class DoublyLinkedList {

	private Node first;
	private Node last;
	
	
	public DoublyLinkedList() {
	   this.first = null;
	   this.last = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			this.last = newNode ;
		}else {
			first.previous = newNode;	
		}
		newNode.next = first;
		this.first = newNode;
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			this.first = newNode;
		}else {
			this.last.next = newNode;
			newNode.previous = this.last;
		}
		
		this.last = newNode;
	}
	
	// assume its not empty list
	
	public Node deleteFirst() {
		Node temp = this.first;
		
		if(this.first.next == null) {
			this.last = null;
		}else {
			
			this.first.next.previous = null;
		}
		this.first = this.first.next;
		return temp;
	}
	
	public Node deleteLast() {
		Node temp = this.last;
		
		if(this.first == null) {
			this.first = null;
		}else {
			this.last.previous.next = null;
		}
		this.last = this.last.previous;
		return temp;
	}
	
	public boolean insertAfter(int key, int data) {
		Node current = this.first;
		
		while(current.data != key) {
			current = current.next;
			if(current == null) {
				return false;
			}
		}
		
	    Node newNode = new Node();
	    newNode.data = data;
	    
	    if(current == last) {
	    	current.next = null;
	    	last = newNode;
	    }else {
	    	newNode.next = current.next;
	    	current.next.previous = newNode;
	    }
		
		newNode.previous = current;
		current.next = newNode;
		return true;
	}
	
	// not empty list;
	public Node deleteKey(int key) {
		Node current = this.first;
		
		while(current.data !=key  ) {	
			current = current.next;
			if(current == null) {
				return null;
			}
		}
		
		if(current == first) {
			first = current.next;
		}else {
			current.previous.next = current.next;
		}
		
		
		if(current==last) {
			last = current.previous;
		}else {
			current.next.previous = current.previous;
		}
		
		return current;
	}
	
	public void displayForward() {
		System.out.print(" First -> last ");
		Node current = this.first;
		
		while(current != null ) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
	
	public void displayBackword() {
		System.out.print(" First -> last ");
		Node current = this.last;
		
		while(current != null ) {
			current.displayNode();
			current = current.previous;
		}
		System.out.println();
	}
	
	
	
	
}
