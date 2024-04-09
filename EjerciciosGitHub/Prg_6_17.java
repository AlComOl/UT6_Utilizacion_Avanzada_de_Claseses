import java.util.*;
/**************************************************************************************
 * @author Álvaro Comenge 
 * 
 * @fecha 8/4/2024
 * 
 * @descripcion
 * Diseñe una clase con un método que permita averiguar la última cifra de un número
 * introducido por teclado.Para la resolución de este problema deberá utilizar wrappers
 * de tipos numéricos.
 * 
 *************************************************************************************/

public class Prg_6_17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero real");
//		El tipo de dato es double por si es decimal el numero
		double n=sc.nextDouble();
		
		ultimaCifra(n);

	}
	
	
	public static void ultimaCifra(double num) {
		
		Double wrapper= num;//creamos obgeto wrapper
		
		wrapper=wrapper%10;//le hacemos el resto para que quede la ultima cifra
		
		//por si el numero es decimal lo pasamos a entero para quitar lo de detras de la coma.
		System.out.println(wrapper.intValue());
	}

}
