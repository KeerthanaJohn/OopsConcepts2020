package DateTimeCalenderDemo;
import java.util.*;
import java.text.SimpleDateFormat;

public class DateClass {

	public static void main(String[] args) throws Exception{
		
		long millisec=System.currentTimeMillis();
		
		Date date=new Date(millisec);
		
		/*double seconds=date.getTime();
		double minutes=seconds/60;
		double hours=minutes/60;
		double days=hours/24;
		double week=days/7;
		double months=days/30;
		double year=days/365;
		System.out.println(seconds+" Seconds "+minutes+"   "+" months "+months+"  years "+year);*/
		
		System.out.println(date);
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		
		String datestr="31/3/2021";
		
		Date date2=sdf.parse(datestr);
		
		System.out.println("DAte 2 is "+date2);
		
		System.out.println("Date before "+date.before(date2));
		
		System.out.println("Date after "+date.after(date2));
		
		System.out.println("Compares "+date.compareTo(date2));
		
		System.out.println("Equals " +date.equals(date2));
		
		sdf=new SimpleDateFormat("d-M-yy : HH-mm-SS");
		
		String str=sdf.format(date);
		
		System.out.println("String str after updating DateFormat "+str);
		
		millisec+=1000*60*60*24;
		date.setTime(millisec);
	
		System.out.println("Date after setTime "+date);
		
	}

}
