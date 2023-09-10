package algo.learn;

public class LinearSearch {

	public static void main(String[] args) {
	
		int values[] = new int[10];
	
		values[0] = 8;
		values[1] = 234;
		values[2] = 558;
		values[3] = 89;
		values[4] = 98;
		values[5] = 43;
		values[6] = 865;
		values[7] = 5;
		values[8] = 87;
		values[9] = 999;
				
		int input = 8;
	    int result = 	searchLiniar(values, input);
		System.out.println(result);
		

	}

	private static int searchLiniar(int[] values,int valueToFind) {
		
		for(int index=0;index<values.length;index++) {
			
			if(values[index] == valueToFind) {
				return index;
			}	
		}
		
		return -1;
	}
	

}
