package exceptionDemo;
import java.util.*;
public class ExceptionDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			int a=10;
			int b=sc.nextInt();
			System.out.println(a/b);
			
			try {
				if(b==1) {
					b=b/(b-1);
				}
				else if(b==2) {
					int c[]=new int[5];
					c[8]=10;
				}
			}
			
			
			catch(ArrayIndexOutOfBoundsException ind) {
				System.out.println("Array Index "+ind);
			}
		}
		catch(ArithmeticException ae){
			System.out.println(ae +" Check the dividend");
		}
		
		
		finally {
			sc.close();
			System.out.println("This is finally block");
		}
		
		System.out.println("Hello");
		

	}

}
