package demo;

interface Calc{
	
	double addi(int a, int b);
	double subt(int a, int b);
}

class MyCalc implements Calc{
	

	public double addi (int a, int b) {
		return (double)a+b;
	}
	
	public double subt(int a, int b) {
		return (double)a-b;
	}
	
	public double sin(int deg) {
		double rad=deg*3.14/180;
		return Math.sin(rad);
	}
	
}


public class Inter {

	public static void main(String[] args) {
		
		MyCalc obj=new MyCalc();
		System.out.println(obj.addi(10, 20));
		System.out.println(obj.subt(50, 20));
		System.out.println(obj.sin(90));
		
		System.out.println();
		
		Calc obj2;
		obj2=new MyCalc();
		System.out.println(obj2.addi(10, 20));
		System.out.println(obj2.subt(50, 20));
		//System.out.println(obj2.sin(90));

	}

}
