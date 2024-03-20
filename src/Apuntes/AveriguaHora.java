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
		
		Date h = new Date();
		String horaMinSeg= DateFormat.getTimeInstance().format(h);
		System.out.println(horaMinSeg);
		int [] fechaInt=new int [3];
		String[] fechaV=horaMinSeg.split(":");
		int hora = 0,min = 0,seg = 0;
		
		for(int i=0;i<fechaInt.length;i++) {
			fechaInt[i]=Integer.parseInt(fechaV[i]);
		}
	
		
		
		while(acertado==false) {
			contador++;
		System.out.println("Introduce hora");
		 hora=sc.nextInt();
		System.out.println("Introduce min");
		 min=sc.nextInt();
		System.out.println("Introduce segundos");
		 seg=sc.nextInt();
		
		
		

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