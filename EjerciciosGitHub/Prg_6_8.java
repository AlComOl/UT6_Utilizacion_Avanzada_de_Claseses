
import java.util.*;

import java.text.SimpleDateFormat;
/**********************************************************
 * @author Álvaro Comenge 
 * 
 * @Fecha 29/03/24
 * 
 * @descripcion
 * Realice una función que dada una fecha de nacimiento de
 * una persona indique cuántos años tiene.
 * 
 * 
 * *********************************************************/
public class Prg_6_8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce fecha nacimiento dd:mm:aaaa");
		
		String nacimiento=sc.next();
		String n[]=new String[1];
		
		n[0]=nacimiento;
		
	System.out.println(AnyosTiene(n));
	}

	
	public static int AnyosTiene(String n[]) {
		int aInteger[]=new int[3];
		int nInteger[]=new int[3];
		int edad=0;
		SimpleDateFormat date = new SimpleDateFormat("dd/M/yyyy");
		String horaMinSeg= date.format(new Date());
		System.out.println(horaMinSeg);
		String a[]=horaMinSeg.split("/");
		
		for(int i=0;i<aInteger.length;i++) {
			
			 aInteger[i]=Integer.parseInt(a[i]);
			 System.out.println("fecha " +aInteger[i]);
		}
		
		
		String n1[]=n[0].split("/");
			for(int i=0;i<n1.length;i++) {
				
				 nInteger[i]=Integer.parseInt(n1[i]);
				 System.out.println("nacimiento "+nInteger[i]);	 
				
			}
		
		
		if(aInteger[2]>nInteger[2]) {
			if(aInteger[1]>nInteger[1]) {
				if(aInteger[0]>nInteger[0]) {
					edad=aInteger[2]-nInteger[2];
			}
		}
			
		}else {
			edad=(aInteger[2]-nInteger[2])-1;
		}
	
		
	return edad;
	}
}