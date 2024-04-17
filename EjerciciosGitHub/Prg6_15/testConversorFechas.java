package Prg6_15;
/***************************************************************************************
 * @author Álvaro Comenge 
 * 
 * @fecha 17/04/24
 * 
 * @descripcion
 * 
 * Realice una clase ConversorFechas que tenga los siguientes métodos:  String normalToAmericano(String).
 * Este método convierte una fecha en formato normal dd/mm/yyyy a formato americano mm/dd/yyyy.  String americanoToNormal(String).
 * Este método realiza el paso contrario, convierte fechas en formato americano a formato normal. 
 * 
 * 
 ***************************************************************************************/
import java.util.*;

public class testConversorFechas {

	public static void main(String[] args) {
		String fecha;
		System.out.println("Introduce fecha en formato dd/mm/aa");
		Scanner sc= new Scanner(System.in);
		 fecha=sc.next();
		
		Conversorfechas conversor=new Conversorfechas();
		
		String res=conversor.normalToAmericano(fecha);
		
		System.out.println(res);
		
		
		System.out.println("Introduce fecha en formato mm/dd/aa");
		
		fecha=sc.next();
		
		String res1=conversor.AmericanoToNormal(fecha);
		
		System.out.println(res1);
		
	}



}
