package listDemo;

import java.util.AbstractList;
import java.util.LinkedList;

public class AbstractSequentialListDEMO {
	public static void main(String[] args) {

		AbstractList<Object> absli=new LinkedList<Object>();
		absli.add(1);
		absli.add("Hello");
		absli.remove(1);
		System.out.println(absli);

	}
}
