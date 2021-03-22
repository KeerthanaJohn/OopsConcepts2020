package trywithresourcesdemo;

public class TryWithResourcesDemo {

	public static void main(String[] args) throws Exception{
		try (AutoClosableDemoFirst one=new AutoClosableDemoFirst();
				AutoClosableDemoSecond two=new AutoClosableDemoSecond()){
			
			one.display();
			two.display();
			
		}

	}

}
