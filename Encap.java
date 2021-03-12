package demo;
//import java.lang.*;
class Account{
	
	private double balance=0;
	
	public void credit(double amount) {
		if(amount>0)
			balance+=amount;
	}
	
	public void debit(double amount) {
		if(amount > 0 && balance >= amount) {
			balance-=amount;
		}
	}
	
	public void showBalance() {
		System.out.println("Current Balance = "+balance);
		
	}
	
}
public class Encap {

	public static void main(String[] args) {
		Account obj1=new Account();
		obj1.credit(5000.00);
		obj1.debit(2000.00);
		obj1.showBalance();

	}

}
