package DateTimeCalenderDemo;
import java.util.*;

public class CalendarClassDemo {

	public static void main(String[] args) {
		GregorianCalendar gcal=new GregorianCalendar(); 
		System.out.println(gcal.getTime());
		
		gcal.add(Calendar.DATE, 12);
		System.out.println(gcal.getTime());
		
		gcal.add(Calendar.YEAR, 3);
		System.out.println(gcal.getTime());
		
		gcal.add(Calendar.MONTH, 8);
		gcal.add(Calendar.DATE, -29);
		System.out.println(gcal.getTime());
		
		System.out.println("Month : "+gcal.get(Calendar.MONTH));
		
		System.out.println("Date : "+gcal.get(Calendar.DATE));
		
		System.out.println("Year : "+gcal.get(Calendar.YEAR));
		
		GregorianCalendar calendar=new GregorianCalendar(2006,1,12);
		System.out.println(calendar.getTime());
		
		System.out.println(calendar.equals(gcal));
		
		System.out.println(calendar.compareTo(gcal));
		
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.getTime());
		System.out.println("DAY OF MONTH : "+cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("DATE : "+cal.get(Calendar.DATE));
		
		System.out.println("DAY OF WEEK : "+cal.get(Calendar.DAY_OF_MONTH));

		
	}

}


