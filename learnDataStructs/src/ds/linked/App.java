package ds.linked;

public class App {

	public static void main(String[] args) {
		
		Node nodeA = new Node();
		Node nodeB = new Node();
		Node nodeC = new Node();
		Node nodeD = new Node();
		
		nodeA.data = 4;
		
		nodeB.data = 3;
			
		nodeC.data = 7;
				
		nodeD.data = 8;
		
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;

		System.out.println(nodeA);
		System.out.println(listLenth(nodeA));
		System.out.println(listLenth(nodeB));
		

	}

	public static int listLenth(Node node) {
		int lenth=1;
		
		for(Node nodeIndex=node; nodeIndex.next != null; nodeIndex = nodeIndex.next  ) {
			lenth++;
		}
		
		return lenth;
	}
	
	
	
	
}
