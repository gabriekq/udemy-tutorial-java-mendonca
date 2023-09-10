package pratice.processingfiles.advanced;

public class MyClass implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Closed");
		
	}

}
