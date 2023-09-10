package ds.heapimplentatio;

public class Heap {

	private Node[] heapArray;
	private int maxSize;
	private int currentSize; // number of nodes in array
	
	
	public Heap(int size) {
		this.maxSize = size;
		currentSize = 0;
		heapArray = new Node[size];
	}
	
	public int getSize() {
		return currentSize;
	}
	
	public boolean isEnpty() {
		return (currentSize == 0);
	}
	
	
	public boolean insert(int key) {
		
		if(currentSize == maxSize) {
			return false;
		}
		
		Node newNode = new Node(key);
		heapArray[currentSize] = newNode;
		
		trickleUp(currentSize);
		
		currentSize++;
		return true;
		
	}

	public void trickleUp(int index) {
		int parentIndex = (index -1) / 2;
		Node nodeToInsert = heapArray[index];
		
		
		while((index > 0) && (heapArray[parentIndex].getKey() < nodeToInsert.getKey())  ) {
			heapArray[index] = heapArray[parentIndex]; // move parent donw
			index = parentIndex;
			parentIndex = (parentIndex -1)/2;
			
		}
		heapArray[index] =nodeToInsert;
	}
	
	
	public Node remove() {
		Node root = heapArray[0];
		currentSize = currentSize -1;
		heapArray[0] = heapArray[currentSize];
		trickleDown(0);
		return root;
		
	}

	private void trickleDown(int index) {
		
		int largerChildIndex;
		Node top = heapArray[index]; // last node in the top variable
		
		// wil run as long as the index is not in the bottonw row (at lest 1 child)
		while(index < currentSize/2) {
			
			int leftChildIndex = (2*index)+1;
			int rightChildIndex = (2*index)+2;
			
			if( (rightChildIndex < currentSize)  &&
				heapArray[leftChildIndex].getKey() < heapArray[rightChildIndex].getKey()   ) {
				largerChildIndex = rightChildIndex;
			}else {
				largerChildIndex = leftChildIndex;
			}
			
			
			if(top.getKey() >= heapArray[largerChildIndex].getKey() ) {
				break;
			}
			heapArray[index] = heapArray[largerChildIndex];
			index = largerChildIndex;
		}
		heapArray[index] = top;
		
	}
	
	
	public void DisplayHeap() {
		
		
		
		int index =0;	
		while(index <currentSize) {

			System.out.print(" "+heapArray[index].getKey());		
			
			index = index +1;
		}
		
	}
	
	// exemple that works its not mine
	public void displayHeap() {
        System.out.println("Heap Array: ");
        for(int m = 0; m < currentSize; m++) {
            if(heapArray[m] != null) {
                System.out.print( heapArray[m].getKey() + " ");
            }
            System.out.println();
            
            int nBlanks = 32;
            int itemsPerRow = 1;
            int column = 0;
            int j = 0; // current item
            
            String dots = "...............................";
            System.out.println(dots+dots);
            while(currentSize > 0) {
                if(column == 0) {
                    for(int k = 0; k < nBlanks; k++) {
                        System.out.print(" ");
                    }
                }
                System.out.print(heapArray[j].getKey());
                j++;
                if(j == currentSize) {
                    break;
                }
                
                column++;
                // end of row
                if(column == itemsPerRow) {
                    nBlanks = nBlanks/2; // half the blanks
                    itemsPerRow = itemsPerRow * 2;     // twice the items
                    column = 0;
                    System.out.println();
                } else {
                    for(int k=0; k<nBlanks*2; k++) {
                        System.out.print(" ");
                    }
                }
                    
            }
            System.out.println("\n"+dots+dots);
        }
        
        
    }
	
	
	
}
