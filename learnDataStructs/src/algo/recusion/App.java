package algo.recusion;

public class App {

	public static void main(String[] args) {

		int values[] = new int[10];

		values[0] = 1;
		values[1] = 2;
		values[2] = 3;
		values[3] = 4;
		values[4] = 5;
		values[5] = 6;
		values[6] = 7;
		values[7] = 8;
		values[8] = 9;
		values[9] = 10;

		int input = 999;
		// int result = reduceSearch(values, 0, input);
		// System.out.println(result);

		int resultB = binarySearch(values, 0, 9, 6);
		System.out.println(resultB);

	}

	public static void ReduceByOne(int n) {

		if (n >= 0) {
			ReduceByOne(n - 1);
		}
		System.out.println("compleated call " + n);
	}

	public static int reduceSearch(int[] values, int index, int valueToFind) {
		int nItens = values.length - 1;

		if (index > nItens) {
			return -1;
		} else {

			if (values[index] == valueToFind) {
				return index;
			} else {
				return reduceSearch(values, index + 1, valueToFind);
			}

		}

	}

	public static int binarySearch(int[] values, int p, int r, int valueToFindX) {

		if (p > r) {
			return -1;
		} else {

			int q = (p + r) / 2;

			if (values[q] == valueToFindX) {
				return q;
			} else {

				if (values[q] > valueToFindX) {
					return binarySearch(values, p, q - 1, valueToFindX);
				} else {
					return binarySearch(values, q + 1, r, valueToFindX);
				}

			}

		}

	}

}
