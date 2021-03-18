package stringdemo;

public class SringPrograms {

	public static void main(String[] args) {
		String str1=new String("Welcome");
		String str2="Hello";
		
		System.out.println("String length "+str1.length());
		
		System.out.println("Index of M in str1  "+str1.indexOf("m"));
		
		System.out.println("Character at 5th position in str1 "+str1.charAt(5));
		
		System.out.println("Replace and priting come in str1 with str2 "+str1.replace("come",str2));
		
		System.out.println("Printing Str1 in lowercase "+str1.toLowerCase());
		
		System.out.println("Printing Str1 in uppercase "+str1.toUpperCase());
		
		System.out.println("String comparision "+str1.compareTo(str2));
		
		String trimdemo="           Hey            hi                ";
		System.out.println("Trimming the String "+trimdemo.trim());
		
		System.out.println("String concatination "+str1.concat(str2));
		


	}

}
