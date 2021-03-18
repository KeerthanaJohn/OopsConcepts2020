package stringdemo;

public class StringBuilderDemo {
	int i;
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello");

		sb.append(" Welcome");
		System.out.println(sb);
		
		sb.insert(0, "Hi ");
		System.out.println(sb);
		
		int index=sb.indexOf("Hello");
		sb.delete(index, sb.indexOf("o")+1);		
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		
		sb.replace(0,3,"Hello");
		System.out.println(sb);
		
		String str=sb.substring(6);
		System.out.println(str);
		
		CharSequence str1=sb.subSequence(0, 6);
		System.out.println(str1);
		
	}

}
