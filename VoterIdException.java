package exceptionDemo;

public class VoterIdException extends Exception{

	public VoterIdException(int age) {
		System.out.println("Your Age is "+age);
	}
	
	public static void verifyAge(int age) {
		if(age<18) {
			try {
			throw new VoterIdException(age);
			}
			catch(VoterIdException e){
				String str=e.toString();
				System.out.println("Check your age "+str);				
			}
		}
	}

}
