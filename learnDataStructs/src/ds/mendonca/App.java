package ds.mendonca;

public class App {

	public static void main(String[] args) {
	
		Stack stack = new Stack(3);
		
		stack.push(20);
		stack.push(40);
		stack.push(60);
		stack.push(12);
		stack.push(32);
		stack.push(87);
		
		while(!stack.isEmpty()) {
			
			long value = stack.pop();
		//	System.out.println(value);
		}

		
	System.out.println(reverseString("Hello"));
	}
	
	
	public static String reverseString(String str) {
	
		Stack2 stack2 = new Stack2(str.length());
		String result="";
		
		for(int index=0;index < str.length();index++ ) {
		  char letter = str.charAt(index);
		  stack2.push(letter);	
		}
		
          while(!stack2.isEmpty()) {
			
        	char value = stack2.pop();
        	result = result.concat(value+"");
		}
		
		return result;
	}
	
	
	
	

}
