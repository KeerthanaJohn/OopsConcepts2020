package demo;

class Dogie {
	
	void eat(){
		System.out.println("Eating Meat");
	}
	
	void eat(String type){
		System.out.println("Eating Meat "+ type );
	}   
}

public class Poly2 {

	public static void main(String[] args) {
		Dogie a1=new Dogie();
		Dogie a2=new Dogie();  
		  
		a1.eat();  
		a2.eat("Chicken");  

	}

}
