import java.util.*;
/**************************************************************************************
 * @autor Álvaro Comenge
 * 
 * @fecha 09/04/2024
 * 
 * @descripcion Dada la siguiente clase: public abstract class Sorteo{ 
 * protected int posibilidades; public abstract int lanzar(); }
 * Se pide:  Crear la clase dado, la cual desciende de la clase Sorteo.
 * La clase dado, en la llamada lanzar() mostrará un número aleatorio del 1 al 6.ç
 *  Crear la clase moneda, la cual desciende de la clase Sorteo. 
 * Esta clase en la llamada al método lanzar() mostrará las palabras cara o cruz.
 * 
 * 
 * 
 * *************************************************************************************/
public class Prg_6_13 {

	public static void main(String[] args) {
		
		Dado d1=new Dado();
		
		System.out.println(d1.lanzar());
		
		Moneda m1=new Moneda();
		
		if(m1.lanzar()==1) {
			System.out.println("Cara");
		}else {
			System.out.println("Cruz");
		}

	}
	
	 public static abstract class Sorteo{
		 
		 protected int posibilidades; 
		 
		 public abstract int lanzar();
	 } 
	 
	 public  static class Dado extends Sorteo{

		@Override
		public  int lanzar() {
			Random ramdom=new Random();
			
			int numeroRandom=ramdom.nextInt(1,6);
			
			return numeroRandom;
		}
		 
	 }
	 
	 public static class Moneda extends Sorteo{

		@Override
		public int lanzar() {
			Random ramdom=new Random();
			
			int caraCruz=ramdom.nextInt(0,2);
			System.out.println(caraCruz);
			
			return caraCruz;
		}
		 
	 }
}
