package Prg_6_14;
/**************
 * @autor Álvaro Comenge
 * 
 * @descripcion
 * Realice una clase conversor que tenga las siguientes características:
 * Tome como parámetro en el constructor un valor entero.
 * Tiene un método getNumero que dependiendo del parámetro devolverá el mismo número en el siguiente formato:
 * Parámetro Formato B Binario (String) H Hexadecimal (String) O Octal (String)
 * Realice un método main en la clase para probar todo lo anterior
 * *************/
public class Conversor {
	
	private int valor;
	
	public Conversor(int valor) {
		this.valor=valor;
	}
	
	/****
	 * @param formato al que se quiere convertir
	 * 
	 * @return devuelve el formato elegido del num introducido
	 * 
	 ********/
	public String  getNumero(int formato) {
		String res="";
		
		
		if(formato==1) {
			 res=	Integer.toBinaryString(valor);
			
		}else if(formato==2) {
			 res= Integer.toHexString(valor);
		}else if(formato==3) {
			 res= Integer.toOctalString(valor);
		}
			
		return	res;
	}

}
