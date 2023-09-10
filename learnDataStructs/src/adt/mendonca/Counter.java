package adt.mendonca;

public class Counter {

	private int currentValue;
	private String name = null;
	
	public Counter(String str) {
		this.name = str;
	}
	
	
	
	public void increment() {
		currentValue++;
	}

	public int getCurrentValue() {
		return currentValue;
	}


	@Override
	public String toString() {
		return "Counter [currentValue=" + currentValue + ", name=" + name + "]";
	}


	
}
