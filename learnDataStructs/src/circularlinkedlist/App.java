package circularlinkedlist;

import ds.linked.SinglyLinkedList;

public class App {

	public static void main(String[] args) {
		

	  CircularLinkedList myList = new CircularLinkedList();
		
		myList.insertFirst(100);
		myList.insertFirst(50);
		myList.insertFirst(300);
		myList.insertLast(5555);
	
		myList.displayList();
		
		
	}

}
