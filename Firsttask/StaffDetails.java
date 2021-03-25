package Firsttask;

import java.io.Serializable;

public class StaffDetails implements Serializable{
	
	private String staff_Name;
	private String dept="IT";
	private String staff_ID;
	private float salary;
	private String staff_grade=StaffGrade.grade((int)this.salary);
	
	public StaffDetails(String staff_Name, String dept, String staff_ID, float salary ) {
		this.staff_Name=staff_Name;
		this.dept=dept;
		this.staff_ID=staff_ID;
		this.salary=salary;
	}
	
	public StaffDetails(String staff_Name, String staff_ID, float salary ) {
		this.staff_Name=staff_Name;
		this.staff_ID=staff_ID;
		this.salary=salary;
	}
	
	public String getStaffName() {
		return this.staff_Name;
	}
	
	public void setStaffName(String staff_Name) {
		this.staff_Name=staff_Name;
	}
	
	public String getStaffID() {
		return this.staff_ID;
	}
	
	public void setStaffID(String staff_ID) {
		this.staff_ID=staff_ID;
	}
	
	public float getSalary() {
		return this.salary;
	}
	
	public void setSalary(float salary) {
		this.salary=salary;
		this.staff_grade=StaffGrade.grade((int)this.salary);
	}
	
	public String getDept() {
		return this.dept;
	}
	
	public void setDept(String dept) {
		this.dept= dept;
	}
	
	public String getGrade() {
		return this.staff_grade;
	}
	
	public String toString() {
		return "Staff Name is : "+this.staff_Name+"\nStaff Id is : "+this.staff_ID+"\nStaff Department is : "+this.dept+"\nStaff monthly salary : "+this.salary+"\nStaff Grade is : "+this.staff_grade;
	}
}
