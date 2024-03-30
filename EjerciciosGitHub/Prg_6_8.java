
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

	/****************************************************************************************
	 * @descripcion obtenemos la fecha de hoy por medio de SimpleFormatDate
	 * metiendo en cada posición del vector dia,mes,año metiendo en un vetor de strings
	 * Convertimos los elementos del vector String a int con los wrappers, y despues comparamos
	 * @param n el vector edad es la fecha de nacimiento introducida
	 * @return edad 
	 *******************************************************************************************/
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
			 
		}
		
		
		String n1[]=n[0].split("/");
			for(int i=0;i<n1.length;i++) {
				
				 nInteger[i]=Integer.parseInt(n1[i]);
				
				
			}
		
		
		if(aInteger[2]>nInteger[2]) {
			if(aInteger[1]>nInteger[1]) {
				if(aInteger[0]>=nInteger[0]) {
					edad=aInteger[2]-nInteger[2];
				}else {
					edad=(aInteger[2]-nInteger[2])-1;
				}
			}else {
				edad=(aInteger[2]-nInteger[2])-1;
			}
			
		}else {
			System.out.println("La edad es mayor que la fecha de nacimiento");
			}
	
		
	return edad;
	}
}
