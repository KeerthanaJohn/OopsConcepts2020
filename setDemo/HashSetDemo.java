package setDemo;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Object> set1=new HashSet<Object>();
		
		set1.add("a");
		set1.add("b");
		set1.add(1);
		set1.add('a');
		set1.remove(1);
		
		//Iterator<Object> i = set1.iterator();
		set1.remove("a"); // This will lead to error because ... Fail-Fast behaviour of iterators
		System.out.println(set1.contains(1));
		/*while(i.hasNext()) {
			System.out.println(i.next());
		}*/
		System.out.println(set1);
		
		HashSet<String> set2=new HashSet<String>();
		set2.add("a");
		set2.add("b");
		set2.add("1");
		set1.add("1");
		
		System.out.println(set1.equals(set2));
		
		set1.clear();
		System.out.println(set1);
		
		Set<Integer> one=new HashSet<Integer>(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
		
		Set<Integer> two=new HashSet<Integer>();
		two.addAll(Arrays.asList(new Integer[] {1,5,8,0,5,7}));
		
		Set<Integer> union=new HashSet<Integer>();
		union.addAll(one);
		union.addAll(two);
		System.out.println("Union of two sets : "+union);
		
		Set<Integer> intersection=new HashSet<Integer>(one);
		intersection.retainAll(two);
		System.out.println("Intersection of two sets : "+intersection);
		
		Set<Integer> difference=new HashSet<Integer>(one);
		difference.removeAll(two);
		System.out.println("Difference : "+difference);
	;	

	}

}
