import java.util.*;
/**************************************************************************************
 * @author Álvaro Comenge
 * 
 * @Fecha 18/04/24
 * 
 * @descripcion
 * 
 * Realice una clase Test en con un método main que tome por teclado dos números 
 * y muestre la suma, multiplicación, división y módulo. En el caso de que el segundo 
 * número sea 0, el programa deberá de atrapar las excepciones que se puedan producir.
 * Para la resolución de este problema necesitará utilizar wrappers.
 * 
 * 
 *************************************************************************************/
public class Prg_6_16 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Integer n=0, n1=0,sum,mul,div,mod;
		
		System.out.println("Introduce dos numeros");
		n=sc.nextInt();
		n1=sc.nextInt();
		
		sum=n+n1;
		mul=n*n1;
		div=0;
		mod=0;
		
		try {
		
			div=n/n1;
			mod=n%n1;
			
		} catch (ArithmeticException e) {
			 
			System.out.println("EROR:No se puede dividir por cero");
		}
		
		System.out.println("La suma de los numeros "+sum);
		System.out.println("La multiplicacion de los numeros "+mul);
		System.out.println("La division de los numeros "+ div);
		System.out.println("El resto de la division de los numeros "+mod);

	}

}
