package basic_java;

public class ArraysLearning {

	public static void main(String[] args) {
		
		int []values = new int[100];
	
		values[2] = 1000;
		values[99]= 98745;
		
		System.out.println(values[2]);
		
		String [] words = new String[] {"my","Name","is"};
		
		System.out.println(words[words.length-1]);
		
		words = new String [10];
		System.out.println(words[0]);

	}

}
