package Prg_6_14;
import java.util.*;
/******************************************
 * @autor Álvaro Comenge
 * 
 * @descripcion
 * El main tiene un switch para eligir el numero y la opcion a convertir
 * 
 * @fecha 16/04/24
 * 
 * *****************************************/


public class TestMain {

	public static void main(String[] args) {
		int key=0;
		int num=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Elige la opcion para convertir");
		System.out.println("1-Binario 2-Hexadecimal 3-Octal");
		key=sc.nextInt();
		System.out.println("Introduce el numero");
		num=sc.nextInt();
		Conversor c=new Conversor (num);
		
		switch (key) {
		case 1: 
			System.out.println(c.getNumero(1));
		break;
		case 2:
			System.out.println(c.getNumero(2));
		break;
		case 3:
			System.out.println(c.getNumero(3));
		break;
		
		}
		

	}

}
