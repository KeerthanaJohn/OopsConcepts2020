package listDemo;
import java.util.*;

public class SynchronizedListDemo {

	public static void main(String[] args) {
		
		ArrayList<Object> li=new ArrayList<Object>();
		li.add("one");
		li.add(2);
		li.add(true);
		
		System.out.println(li);
		
		List<Object> synclist=Collections.synchronizedList(li);		
		synclist.add(123);
		synclist.remove(2);
		synclist.set(1,24);
		System.out.println(synclist);

	}

}
