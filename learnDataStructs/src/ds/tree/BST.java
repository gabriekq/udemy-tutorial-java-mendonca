package ds.tree;

import java.util.Currency;

public class BST {

	private Node root;

	public void insert(int key, String value) {

		Node newNode = new Node(key, value);

		if (root == null) {
			root = newNode;
		} else {

			Node current = root;
			Node parent;

			while (true) {
				parent = current;

				if (key < current.key) {
					current = current.leftChild;
					if (current == null) {
						parent.leftChild = newNode;
						return;
					}

				} else {
					current = current.rightChild;
					if (current == null) {
						parent.rightChild = newNode;
						return;
					}

				}

			}

		}

	}

	public Node findMin() {
		Node current = root;
		Node last = null;

		while (current != null) {
			last = current;
			current = current.leftChild;

		}

		return last;
	}

	public Node findMax() {
		Node current = root;
		Node last = null;

		while (current != null) {
			last = current;
			current = current.rightChild;
		}

		return last;
	}

	public boolean remove(int key) {

		Node currentNode = root;
		Node parentNode = root;

		boolean isLeftChild = false;

		// search to find the node with the key
		while (currentNode.key != key) {
			parentNode = currentNode;

			if (key < currentNode.key) {
				isLeftChild = true;
				currentNode = currentNode.leftChild;
			} else {
				currentNode = currentNode.rightChild;
				isLeftChild = false;
			}

			if (currentNode == null) {
				return false;
			}

		}

		Node nodeToDelete = currentNode;

		// if is an leaf node
		if ((nodeToDelete.leftChild == null) && (nodeToDelete.rightChild == null)) {

			if (nodeToDelete == root) {
				root = null;
			} else {

				if (isLeftChild) {
					parentNode.leftChild = null;
				} else {
					parentNode.rightChild = null;
				}
			}

		} else {
			// if node has one child is on the left
			if (nodeToDelete.rightChild == null) {

				if (nodeToDelete == root) {
					root = nodeToDelete.leftChild;
				} else {

					if (isLeftChild) {
						parentNode.leftChild = nodeToDelete.leftChild;
					} else {
						parentNode.rightChild = nodeToDelete.leftChild;
					}

				}
				// else part
			} else {
				if (nodeToDelete.leftChild == null) {

					if (nodeToDelete == root) {
						root = nodeToDelete.rightChild;
					} else {

						if (isLeftChild) {
							parentNode.leftChild = nodeToDelete.rightChild;
						} else {
							parentNode.rightChild = nodeToDelete.rightChild;
						}

					}
				} else { // if the node has 2 chlder

					Node sucessor = getSuccessor(nodeToDelete);
					// connect parentof
					if (nodeToDelete == root) {
                      root = sucessor;
					}else {
						
						if(isLeftChild) {
							parentNode.leftChild = sucessor;
						}else {
							parentNode.rightChild = sucessor;
						}
						sucessor.leftChild = nodeToDelete.leftChild;
						
					}

				}

			}

		}

		return true;
	}

	private Node getSuccessor(Node nodeToDelete) {
		
		Node sucessorParent = nodeToDelete;
		Node sucessor = nodeToDelete;
		
		Node current = nodeToDelete.rightChild;  // go to the right child
		
		while(current != null) {
			sucessorParent = sucessor;
			sucessor = current;
			current = current.leftChild;
		}
		
		if(sucessor != nodeToDelete.rightChild) {
			sucessorParent.leftChild = sucessor.rightChild;
			sucessor.rightChild = nodeToDelete.rightChild;
		}
		
		
		return sucessor;
	}
	
	
	
	public void displayTree() {
    //    Stack globalStack = new Stack();
    //    globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println("......................................................");
        
        while(isRowEmpty==false) {
      //      Stack localStack = new Stack();
            isRowEmpty = true;
            for(int j=0; j<nBlanks; j++) {
                System.out.print(" ");
            }
                
      //      while(globalStack.isEmpty()==false) {
       //         Node temp = (Node)globalStack.pop(); 
       //         if(temp != null) {
         //           System.out.print(temp.key); 
         //           localStack.push(temp.leftChild); 
         //           localStack.push(temp.rightChild);
          //          if(temp.leftChild != null || temp.rightChild != null) {
                        isRowEmpty = false; 
           //         }
         //       } else {
          //          System.out.print("--"); 
           //         localStack.push(null); 
           //         localStack.push(null);
                }
                
                for(int j=0; j<nBlanks*2-2; j++) {
                    System.out.print(" ");
                }
       //     }
            
         //   System.out.println();
         //   nBlanks = nBlanks/2;
            
      //      while(localStack.isEmpty()==false)
      //          globalStack.push( localStack.pop() ); 
      //      }
        System.out.println( "......................................................");
 
 }

	
	
	

}
