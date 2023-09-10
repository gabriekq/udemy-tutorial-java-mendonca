package algo.learn;

public class BinarySearch {

	public static void main(String[] args) {

       System.out.println(binarySearch(new  int[] {1,2,3,4,7,9,12,18},12   ));

	}

	private static int binarySearch(int[] values, int valueToFind) {

		int p = 0;
		int r = values.length - 1;

		while (p <= r) {
			int q = (p + r) / 2;
			System.out.println(q);

			if (valueToFind < values[q]) {
				r = q - 1;
			} else {
				if (valueToFind > values[q]) {
					p = q + 1;
				} else {
					return q;
				}
			}
		}

		return -1;
	}

}
