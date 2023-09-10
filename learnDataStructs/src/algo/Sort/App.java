package algo.Sort;

public class App {

	public static void main(String[] args) {		
		// Qulkt sort
		int [] inputArray = {8, 3, 74, 1, 5 ,6,87,44,22,33,77,443,11,8794};
		quickSort(inputArray, 0,13);
		
	      for (int index = 0; index < inputArray.length; index++) {
				System.out.println(inputArray[index]);
			}

	}

	private static int[] selectionSort(int[] array) {   // mendonca tecnolog
		int minIndexValue = 0, minValue = 0;
		boolean excuted = false;

		for (int index = 0; index < array.length; index++) {

			int currentIndex = index;
			int currentValue = array[index];

			for (int indexVerify = index + 1; indexVerify < array.length; indexVerify++) {

				if (array[indexVerify] < array[currentIndex]) {
					minIndexValue = indexVerify;
					minValue = array[indexVerify];
					excuted = true;
				}
			}

			if (excuted == true) {
				array[index] = minValue;
				array[minIndexValue] = currentValue;
				excuted = false;
			}

		}

		return array;
	}
	
	
	public static void quickSort(int [] inputArray, int star, int end ) {
		
		if(star < end) {
			int  qPartition = Partition(inputArray,star,end);
			quickSort( inputArray,  star,  qPartition-1 );
			quickSort( inputArray,  qPartition+1,  end );
		}
		
		
		
	}

	public static int Partition(int[] inputArray, int star, int end) {
		
		int piv = inputArray[end];
		int index = star - 1;
		
		for(int indexJ = star;indexJ <= end-1; indexJ++   ) {
			
			if(inputArray[indexJ] <= piv  ) {
				index = index +1;
				int valorI = inputArray[index];
				int valorJ = inputArray[indexJ];
				
				inputArray[index] = valorJ;
				inputArray[indexJ] = valorI;	
			}	
		}
		
		int valorI = inputArray[index+1];
		inputArray[end] = valorI;
		inputArray[index+1] = piv;
		
		
		return index+1;
	}
	
	
}
