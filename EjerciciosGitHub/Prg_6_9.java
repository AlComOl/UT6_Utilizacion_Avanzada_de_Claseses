/**********************************************************
 * @author Álvaro Comenge 
 * 
 * @Fecha 01/04/24
 * 
 * @descripcion
 * El métodox() tiene que devolver un entero pero da problemas al compilar.
 *  Reescriba el método utilizando un wrapper Double. int dato; ... 
 *  public int metodox(){ return dato*1.1; }
 * 
 * 
 * *********************************************************/
public class Prg_6_9 {
	
	
	 public static void main(String[] args) {
	
	System.out.println(metodox());	
		}
	
	static  int dato=5;
	 
	 public static int metodox(){
		 Double d=dato*1.1;
		
		 return d.intValue(); 
		 }
	

}
