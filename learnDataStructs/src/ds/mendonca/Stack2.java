package ds.mendonca;

public class Stack2 {

	private int maxSize;
	private char[] stackArray;
	private int top;

	public Stack2(int size) {
		this.maxSize = size;
		this.stackArray = new char[maxSize];
		this.top = -1;
	}

	public void push(char value) {
		if (isFull()) {
			System.out.println("this stack is already full");
		} else {
			top++;
			stackArray[top] = value;
		}
	}

	public char pop() {
		if (isEmpty()) {
			System.out.println("this stack is Empty");
			return '0';
		} else {
			int oldTop = top;
			top--;
			return stackArray[oldTop];
		}
	}

	public char peak() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (maxSize - 1 == top);
	}

}
