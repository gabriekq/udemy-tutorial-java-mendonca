package pratice.processingfiles.advanced;

public class Application2 {

	public static void main(String[] args) {
		
	     try(MyClass myclass = new MyClass();){
	    	 
	    	 System.out.println(myclass);
	    	 
	    	 
	     } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
