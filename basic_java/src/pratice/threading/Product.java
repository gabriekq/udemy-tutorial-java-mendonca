package pratice.threading;

public class Product {

	private int id;
	private String name;
	
	
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + "| name=" + name + "]";
	}
	
	
	
}
