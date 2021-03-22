package listDemo;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> c=new CopyOnWriteArrayList<String>();
		
		c.add(null);
		c.add("A");
		c.add(null);
		
		int a=c.indexOf(null,1);
		System.out.println(a);
		
		System.out.println(c.size());
		System.out.println(c.get(2));
		
		c.set(2, "123");
		System.out.println(c);
		
		List<String> li=new ArrayList<String>();
		li.add("31");
		li.add("24");
		li.add(1, null);
		System.out.println(li);
		
		c.addAll(li);
		System.out.println(c);
		

	}

}
