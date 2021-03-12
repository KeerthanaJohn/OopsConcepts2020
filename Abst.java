package demo;

abstract class Base{
	
	abstract void a();
	abstract void b();
	
	void fun() {
		System.out.println("Hello");
	}
}

abstract class Derived extends Base{
	
	void a() {
		System.out.println("Hi");
	}
}

class Derived1 extends Derived{
	
	void b() {
		System.out.println("Welcome");
	}
	
}

public class Abst {

	public static void main(String[] args) {
		Base obj1;
		Derived obj2;
		Derived1 obj3;
		
		obj1=new Derived1();
		obj2=new Derived1();
		obj3=new Derived1();
		
		obj1.a();
		obj1.b();
		obj1.fun();
		
		System.out.println();
		
		obj2.a();
		obj2.b();
		obj2.fun();
		
		System.out.println();
		
		obj3.a();
		obj3.b();
		obj3.fun();
		
	}

}
