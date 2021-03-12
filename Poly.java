package demo;

class Animal{  
	
	void eat(){
		System.out.println("Eating");
	}  
}  

class Dog extends Animal{
	
	void eat(){
		System.out.println("Eating Meat");
	}   
}

class Poly{
	public static void main(String args[]){  
			Animal a1=new Animal();
			Animal a2=new Dog();  
			  
			a1.eat();  
			a2.eat();  
 
}  
}  
