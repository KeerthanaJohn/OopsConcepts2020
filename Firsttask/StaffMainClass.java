package Firsttask;
import java.util.*;
import java.io.*;

public class StaffMainClass {
	
	public static boolean checkSalary(StaffDetails obj) {
		float sal=obj.getSalary();
		String dept=obj.getDept();
		try {
		switch(dept) {
		case "IT":if(sal>35000 || sal<20000) 
			throw new CheckSalaryException();
			break;
		case "EEE":if(sal>32000 || sal<23000)
			throw new CheckSalaryException();
			break;
		case "ETE":if(sal>32000 || sal<25000)
			throw new CheckSalaryException();
			break;
		case "CSC":if(sal>35000 || sal<20000)
			throw new CheckSalaryException();
			break;
		case "EIE":if(sal>32000 || sal<27000)
			throw new CheckSalaryException();
			break;
		case "MECH":if(sal>37000 || sal<28000)
			throw new CheckSalaryException();
			break;
		case "CIVIL":if(sal>37000 || sal<23000)
			throw new CheckSalaryException();
			break;
		default : throw new DeptException();
		}
		}
		
		catch(CheckSalaryException e) {
			System.err.println(dept+" cannot have "+sal+" as salary");
			return false;
		}
		
		catch(DeptException e) {
			System.err.println(dept+" Department doesn't exists");
			return false;
		}
		return true;
	}
	
	public static boolean checkDepartment(String dept) {
		ArrayList<String> deptar=new ArrayList<String>(Arrays.asList(new String[]{"EIE","EEE","IT","CSC","MECH","CIVIL","ETE"}));
		if(deptar.contains(dept))
			return true;
		return false;
	}

	public static boolean checkId(StaffDetails obj) {
		String dept=obj.getDept();
		String id=obj.getStaffID();
		try {
			switch(dept) {
			case "IT":if(!id.contains("I")) 
				throw new IdException();
				break;
			case "EEE":if(!id.contains("E"))
				throw new IdException();
				break;
			case "ETE":if(!id.contains("T"))
				throw new IdException();
				break;
			case "CSC":if(!id.contains("C"))
				throw new IdException();
				break;
			case "EIE":if(!id.contains("N"))
				throw new IdException();
				break;
			case "MECH":if(!id.contains("M"))
				throw new IdException();
				break;
			case "CIVIL":if(!id.contains("L"))
				throw new IdException();
				break;
			default :throw new DeptException();
			}
			}
		
			catch(IdException e) {
				System.err.println("Wrong format");
				return false;
			}
		
			catch(DeptException e) {
				System.err.println(dept+" Department doesn't exists");
				return false;
			}
		return true;
	
	}
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of statffs : ");
		int size=sc.nextInt();
		StaffDetails[] al=new StaffDetails[size];
		
		for(int i=0;i <size;i++) {
			System.out.println("Enter staff details for "+i );
			System.out.println("Name : ");
			String name=sc.next();
			
			System.out.println("Enter your department : ");
			String dep=sc.next();
			dep=dep.toUpperCase();
			StaffMainClass.checkDepartment(dep);
			
			System.out.println("Enter staff id : ");
			String staffid=sc.next();
			
			System.out.println("Enter staff salary : ");
			float salary=sc.nextFloat();
			
			StaffDetails obj;
			if(dep=="IT") {
				obj=new StaffDetails(name,staffid,salary);
			}
			else {
				obj=new StaffDetails(name,dep,staffid,salary);
			}
			
			if(!StaffMainClass.checkSalary(obj))
				terminateProgram();
		
			if(!StaffMainClass.checkId(obj))
				terminateProgram();

			al[i]=obj;
			
		}
		sc.close();
		try(FileOutputStream fo=new FileOutputStream("file1.ser");ObjectOutputStream os=new ObjectOutputStream(fo)){
			os.writeObject(al);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
		for(StaffDetails obj:al) {
			System.out.println(obj);
			
		}

	}
	public static void terminateProgram() {
		System.exit(0);
	}
	

}
