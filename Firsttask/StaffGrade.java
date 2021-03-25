package Firsttask;

import java.util.Arrays;
import java.util.TreeSet;

public class StaffGrade {
	public static String grade(int salary) throws Exception{
		TreeSet<Integer> ts=new TreeSet<Integer>(Arrays.asList(new Integer[] { 20000,37000,34000,31000,28000,25000,35000 }));
		if(salary<18000) {
			throw new CheckSalaryException();
			
		}
		else {
		int ceil=ts.ceiling(salary);
		String grade="";
		switch(ceil) {
		case 20000:grade="C";
		break;
		case 25000:grade="C+";
		break;
		case 28000:grade="B";
		break;
		case 31000:grade="B+";
		break;
		case 34000:grade="A";
		break;
		case 37000:grade="A+";
		break;
		default:grade="O";
		}
		return grade;
		}
		
	}
}
