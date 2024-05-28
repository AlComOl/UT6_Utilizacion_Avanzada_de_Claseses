package Apuntes;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class ClaseDate{
//	public static void main(String [] args){
//	Date d = new Date();
//	GregorianCalendar c = new GregorianCalendar();
//	c.setTime(d);
//	System.out.print(c.get(Calendar.DAY_OF_MONTH));
//	System.out.print("-");
//	System.out.print(c.get(Calendar.MONTH)+1);
//	System.out.print("-");
//	System.out.println(c.get(Calendar.YEAR));
//	System.out.print(c.get(Calendar.HOUR));
//	System.out.print(":");
//	System.out.print(c.get(Calendar.MINUTE));
//	System.out.print(":");
//	System.out.print(c.get(Calendar.SECOND));
//	}
	public static void main(String[] args) throws ParseException {
//		Date h=new Date();
//		String hoystr=DateFormat.getDateTimeInstance().format(h);
//		System.out.println(" la hora de hoy es: " + hoystr);
//		String d=hoystr.substring(hoystr.length()-8,hoystr.length());
//		System.out.println(" la hora de hoy es: " +d );
		
		DateFormat df =new SimpleDateFormat("dd-MM-yy");
		
		
		
		Date date=df.parse("12-03-23");
		System.out.println(df.format(date));
		
		}
	}
	