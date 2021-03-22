package trywithresourcesdemo;

public class AutoClosableDemoSecond implements AutoCloseable{
	
	public void display() {
		System.out.println("In two");
	}
	
	public void close() throws Exception{
		System.out.println("Closing Second resource");
	}
}
