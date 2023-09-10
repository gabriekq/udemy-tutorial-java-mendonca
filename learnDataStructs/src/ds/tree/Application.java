package ds.tree;

public class Application {

	public static void main(String[] args) {
		
		
		BST tree = new BST();
		
		tree.insert(10,"Ten");
		tree.insert(20,"vinte");
		tree.insert(15,"quinse");
		tree.insert(5,"cinco");
		tree.insert(2,"Ten");
		tree.insert(17,"Ten");

		
	//	System.out.println(tree.findMax().key);
	//	System.out.println(tree.findMin().key);

	System.out.println(tree.remove(17));
		System.out.println(tree.findMax().key);
		
		
	}

}
