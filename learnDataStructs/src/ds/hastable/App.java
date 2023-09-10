package ds.hastable;

public class App {

	public static void main(String[] args) {
		
		HashTable table = new HashTable(19);
		table.inser("Apple");
		table.inser("Hello");
		table.inser("Felling");
		table.inser("Water");
		table.inser("Africa");
		table.inser("Speed");
		
	//	System.out.println(table.find("Apple"));
		
		table.displayTable();
		
		
	}

}
