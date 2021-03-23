package setDemo;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(1);
		ts.add(8);
		ts.add(3);
		ts.add(2);
		System.out.println("Ceiling : "+ts.ceiling(4));
		System.out.println("Floor : "+ts.floor(4));
		
		System.out.println("Higher : "+ts.higher(4));
		System.out.println("Lower : "+ts.lower(4));
		
		System.out.println("Did the set1 contains 0 : "+ts.contains(0));
		
		
		TreeSet<Integer> tset2=new TreeSet<Integer>();
		tset2=(TreeSet)ts.clone();
		System.out.println("Is the 2nd set empty? "+tset2.isEmpty());
		System.out.println("Cloned successfully from set1 to set2 "+tset2);
		
		ts.clear();
		System.out.println("Is the 1st set empty? "+ts.isEmpty());
		
		tset2.pollFirst();
		System.out.println("After pollfirst in set2 "+tset2);
		
		System.out.println("Removal of 0 from set2 : "+tset2.remove(0));
		

	}

}
