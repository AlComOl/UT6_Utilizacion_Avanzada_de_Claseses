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
		
		double n=sc.nextDouble();
		
		
		
		
		ultimaCifra(n);

	}
	
	
	public static void ultimaCifra(double num) {
		
		Double wrapper= num;
		
		
		
		wrapper=wrapper%10;
		
		
		System.out.println(wrapper.intValue());
	}

}
