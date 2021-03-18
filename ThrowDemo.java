package exceptionDemo;

public class ThrowDemo {

	public static void main(String[] args) {
		ThrowDemo td1=new ThrowDemo();
		//ThrowDemo td2;
		try {
			td1.test();
		}
		catch(NullPointerException a) {
			System.out.println("Caught Second time");
		}
		

	}
	
	protected void test() {
		try {
			throw new NullPointerException();
		}
		
		catch(NullPointerException npe) {
			System.out.println("Caught Null Pointer Exception");
			throw npe;
	
		}
	}

}
