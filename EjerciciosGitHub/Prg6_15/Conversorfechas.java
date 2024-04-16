package Prg6_15;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Conversorfechas {
	
	public String normalToAmericano(String cadena) {
		
		SimpleDateFormat s=new SimpleDateFormat("dd/mm/aaaa");
		
		Date fecha=s.parse(cadena);//cadena a tipo date
		
		long operar=fecha.getTime();//obtengo la fecha
		
		long modificado=operar-(7 * 60 * 60 * 1000);//le resto 7 horas
		
		Date s1= new Date(modificado);//lo meto en el tipo date
		
		SimpleDateFormat s2=new SimpleDateFormat("dd/mm/aaaa");
		
		String res=s2.format(s2);
		
		return res;
		
		
	}

}
