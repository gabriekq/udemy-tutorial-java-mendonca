package algo.Sort;

public class InsetSort {

	public static void main(String[] args) {
		
		int[] myArray = insertionSort(new int[] { 9, 8, 3, 13, 87, 12, 99 });
		
		for (int index = 0; index < myArray.length; index++) {
			System.out.println(myArray[index]);
		}
		

	}

	private static int[] insertionSort(int[] myArray) {

		for (int index = 1; index < myArray.length-1; index++) {
					
			int valueElement = myArray[index];
			int indexJ = index - 1;
			
			while(indexJ>=0 && myArray[indexJ] > valueElement   ) {
				myArray[indexJ+1] = myArray[indexJ];
				indexJ--;
				
			}
			myArray[indexJ+1] = valueElement;
	
	      }
		
		return myArray;
	}

}
