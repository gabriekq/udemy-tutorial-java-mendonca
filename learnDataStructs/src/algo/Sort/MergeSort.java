package algo.Sort;

public class MergeSort {

	public static void sort(int inputArray[]) {
		sort(inputArray, 0, inputArray.length - 1);
	}

	private static void sort(int inputArray[], int start, int end) {

		if (end <= start) {
			return;
		}

		int mid = (start + end) / 2;
		sort(inputArray, start, mid);
		sort(inputArray, mid + 1, end);
		merge(inputArray, start, mid, end);

	}

	private static void merge(int[] inputArray, int start, int mid, int end) {

		int tempArray[] = new int[end - start + 1];

		// index counter for left side of array
		int leftSlot = start;
		// point to right side of array a the start
		int rightSlot = mid + 1;

		int incrementer = 0;

		while ((leftSlot <= mid) && (rightSlot <= end)) {

			if (inputArray[leftSlot] < inputArray[rightSlot]) {
				tempArray[incrementer] = inputArray[leftSlot];
				leftSlot = leftSlot + 1;
			} else {
				tempArray[incrementer] = inputArray[rightSlot];
				rightSlot = rightSlot + 1;
			}
			incrementer = incrementer + 1;
		}

		// when gets to here the abouve loop got compleated
		if (leftSlot <= mid) {
			while (leftSlot <= mid) {
				tempArray[incrementer] = inputArray[leftSlot];
				leftSlot = leftSlot + 1;
				incrementer = incrementer + 1;
			}
		} else {

			if (rightSlot <= end) {

				while (rightSlot <= end) {
					tempArray[incrementer] = inputArray[rightSlot];
					rightSlot = rightSlot + 1;
					incrementer = incrementer + 1;
				}
			}
		} // else part

		 for(int index=0;index<tempArray.length;index++ ) {
			 inputArray[start+index] = tempArray[index];
		 }
		
		
		
	}

}
