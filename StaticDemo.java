package stringdemo;


public class StaticDemo {
	
	int a=10;
	static int b=20;
	
	public void display() {
		System.out.println("Non Static method");
	}
	
	public static void displaystatic() {
		System.out.println("Static method");
	}
	
	static {
		System.out.println("Static block");
	}

	public static void main(String[] args) {
		StaticDemo obj=new StaticDemo();
		obj.display();
		System.out.println(obj.a);
		b=10;
		displaystatic();
		System.out.println(b);
		
	
	}

}

class Abc{
	
	Abc(){
		System.out.println("Constructor");
	}
	
	static {
		System.out.println("AbcStatic");
	}
	
	
}



