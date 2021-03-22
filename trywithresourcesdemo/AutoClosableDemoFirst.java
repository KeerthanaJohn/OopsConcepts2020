package trywithresourcesdemo;

public class AutoClosableDemoFirst implements AutoCloseable {

	public void display() {
		System.out.println("In 1st resource");
	}
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Closing one");
		
	}

}
