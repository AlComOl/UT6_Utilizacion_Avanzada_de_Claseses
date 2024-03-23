package Apuntes;
import java.text.DateFormat;
import java.util.*;

/****************************************************************
 * @autor Álvaro Comenge
 * 
 * @fecha 20/03/24
 * 
 * @Descripcion   Encontrar la Hora
 * 
 * ***************************************************************/
public class AveriguaHora {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 
		int contador=0;
		boolean acertado=false;
		
		Date h = new Date();//instanciamos un obgeto de tipo date 
		String horaMinSeg= DateFormat.getTimeInstance().format(h);//obtenemos la hora actual en una cadena de texto en formato hh:mm:ss
		System.out.println(horaMinSeg);
		int [] fechaInt=new int [3];
//		separamos el String por medio de split , separando por :
		String[] fechaV=horaMinSeg.split(":");
		int hora = 0,min = 0,seg = 0;
		
		for(int i=0;i<fechaInt.length;i++) {//iteramos en el vector
			fechaInt[i]=Integer.parseInt(fechaV[i]);//pasando a entero los elementos(String) en el otro vector de enteros.
		}
	
		
		
		while(acertado==false) {
			contador++;
		System.out.println("Introduce hora");
		 hora=sc.nextInt();
		System.out.println("Introduce min");
		 min=sc.nextInt();
		System.out.println("Introduce segundos");
		 seg=sc.nextInt();
		
		
		
//comparamos el entero introducido con la posición del vector con la hora instanciada del sistema.
//	Si horas minutos y segundos son iguales 
		
		if (hora == fechaInt[0]) {

			if (min == fechaInt[1]) {

				if (seg == fechaInt[2]) {
					acertado=true;
					System.out.println("Acertaste , has necesitado "+ contador + " intenetos");
//				Si no son iguales	
				} else {
					
					if (seg < fechaInt[2]) {//si los segundos son menores
						System.out.println("Es mas tarde");
					} else {//sino
						System.out.println("Es mas  pronto");
					}
				}
//			si los MINUTOS NO SON IGUALES	
			} else {
				if (min < fechaInt[1]) {
					System.out.println("Es mas tarde");//si los minutos son menores
				} else {//sino
					System.out.println("Es pronto");
				}
			}
//			si las HORAS NO SON IGUALES 
		} else {

			if (hora < fechaInt[0]) {//si las horas son menores
				System.out.println("Es mas tarde");
			} else {//sino
				System.out.println("Es pronto");
			}
			sc.close();
		}

	}
		
  }
	
}