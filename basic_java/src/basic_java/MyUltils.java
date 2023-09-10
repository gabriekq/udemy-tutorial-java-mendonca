package basic_java;

 public  class MyUltils {

	public static String printSomeJunk(String argument) {
		System.out.println("Some bla bla bla "+argument);
		return argument;
	}
	
	
	public static int printSomeJunk(int argument) {
		System.out.println("Integer passed "+argument);
		return argument;
	}
	
	
	public static void sum2Numbers(int firstArg,int secondArg) {
		
		System.out.println((secondArg+firstArg));
	}
	
	
	public  int add10(int someArgument) {
	 int result = someArgument+10;
	 return result;
	 
	}
	
	
	
	
	
	
}
