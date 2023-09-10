package ds.hastable;

public class HashTable {

	String[] hashArray;
	int arraySize;
	int size = 0;

	public HashTable(int nuOfSlots) {

		if (isPrime(nuOfSlots)) {
			hashArray = new String[nuOfSlots];
			arraySize = nuOfSlots;
		} else {
			int primeCount = getNextPrime(nuOfSlots);
			hashArray = new String[primeCount];
			arraySize = primeCount;
			System.out.println("Hash table size given is the" + nuOfSlots + "is not prime number");
			System.out.println("Hash table size change to" + primeCount);
		}

	}

	private int getNextPrime(int nuOfSlots) {

		for (int index = nuOfSlots; true; index++) {

			if (isPrime(index)) {
				return index;
			}

		}
	}

	private boolean isPrime(int nuOfSlots) {

		for (int index = 2; index * index <= nuOfSlots; index++) {

			if (nuOfSlots % index == 0) {
				return false;
			}

		}

		return true;
	}

	private int hashFunc1(String word) {

		int hashVal = word.hashCode();
		hashVal = hashVal % arraySize;

		if (hashVal < 0) {
			hashVal = hashVal + arraySize;
		}

		return hashVal; // ideial index position

	}
	


	private int hashFunc2(String word) {

		int hashVal = word.hashCode();
		hashVal = hashVal % arraySize;
		
		if(hashVal < 0) {
			hashVal = hashVal + arraySize;
		}
		
		return 3 - hashVal % 3;
		
	}
	
	
	public void inser(String word) {
		
	  int hashVal =	hashFunc1(word);
	  int stepSize =hashFunc2(word);
		
	  while(hashArray[hashVal] != null ) {
		  
		  hashVal = hashVal + stepSize;
		  hashVal = hashVal & arraySize;
		   
	  }
	  hashArray[hashVal] = word;
	  System.out.println("insert word :"+word+"at the index: "+hashVal);
	  size++;
		
	}
	
	
	public String find(String word) {
		
		  int hashVal =	hashFunc1(word);
		  int stepSize =hashFunc2(word);
		
		  while(hashArray[hashVal] != null ) {
			  
			  if(hashArray[hashVal].equals(word)) {
			     return hashArray[hashVal];
			  }
			  hashVal = hashVal + stepSize;
			  hashVal = hashVal & arraySize;  
		  }
		
		  return hashArray[hashVal];
		  
	}
	
	
	public void displayTable() {
		System.out.println("Table");
		
		for(int index=0;index < hashArray.length;index++   ) {
			if(hashArray[index] != null) {
					System.out.println(hashArray[index]);
			}
		
		}
		
		
	}
		
	
	
	
	
	
	
	

}
