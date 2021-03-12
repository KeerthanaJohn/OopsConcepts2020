package demo;

class BasicAS{
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int sub(int a,int b) {
		return a-b;
	}
	
}

class ScientificAS extends BasicAS{
	
	public double sin(int deg) {
		double rad=deg*3.14/180;
		return Math.sin(rad);
	}
}
public class Inheri {

	public static void main(String[] args) {
		BasicAS obj1=new BasicAS();
		System.out.println("Base class "+obj1.add(1,2));
		System.out.println("Base class "+obj1.sub(30,20));
		
		ScientificAS scicalc=new ScientificAS();
		System.out.println("Derived class "+scicalc.add(1,2));
		System.out.println("Derived class "+scicalc.sub(30,20));
		System.out.println("Derived class "+scicalc.sin(90));
		
		BasicAS obj2=new ScientificAS(); //This vice versa is not possible becoz basic class cannot answer for sin method in this eg. 
		System.out.println(obj2.add(1,2));
		System.out.println(obj2.sub(30,20));
		//System.out.println(obj2.sin(90)); This is not possible becoz compiler knows about the type info only it wont see the object and it only refers to the members of BasicAS
		//this obj2 can only refer the Base class methods 
		//we can call sin method by typecasting
		//System.out.println((ScientificAS)obj2.sin(90));
	}

}
