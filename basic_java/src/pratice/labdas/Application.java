package pratice.labdas;

import java.util.function.BiFunction;

public class Application {

	public static void main(String[] args) {
		
		Walkable tom = new Human();
		//tom.walk();
		
		Walkable wale = new Robot();
		//wale.walk();
		
		walker(tom);
		
		Walkable code	= () -> System.out.println("Bom dia") ;
		
		walker(code);
		
      //  ALambdaInterface test =	() -> {System.out.println("Hello");};
        
		BiFunction<Integer, Integer, Integer>  test = (Integer arg1, Integer arg2) -> { return arg1 + arg2;};
		int value =  test.apply(24, 36);
		System.out.println(value);
		
		myGenericFunc<String> nameFunc = (String name ) -> {
			String result = "";
			for(int index=name.length()-1;index >= 0;index-- ) {
				result = result + name.charAt(index);
			}		
			 return result;

		};
		
		System.out.println(nameFunc.functions("abcdef"));
		
		myGenericFunc<Integer> factorial = (Integer num) -> {
			
			int result=1;
			
			for(int index=1;index<=num;index++) {
			    result = index * result;
			}
			
			return result;
		};
		
		System.out.println(factorial.functions(10));
		
		
	}
	
	public static void walker(Walkable walkable) {
		walkable.walk();
	}

	

	public interface FunctionGabriel{
	   public String reverse(String name);
    }
	
	
    public interface Factoriable {
    	
    	public int factorial(int num);
    	
    }
    
    public interface myGenericFunc<T>{
    	public T functions(T value);
    }
    
	
}



