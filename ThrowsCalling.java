package exceptionDemo;

public class ThrowsCalling {

	public static void main(String[] args) {
		try {
			ThrowsDemo.divide(5, 0);
		}
		
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		//ThrowsDemo.divide(5, 0);
		

	}

}
