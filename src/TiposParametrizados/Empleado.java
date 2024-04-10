package TiposParametrizados;

public class Empleado implements EsComparable{
	
	private int sueldo;
	
	
	public Empleado() {
		
	}
	public Empleado(int sueldo) {
		this.sueldo=sueldo;
		
	}
	
	public String toString() {
		return ;
	}
	
	public int compara (EsComparable c ){
		// Comparación de este empleado con el que pasan
		//Hay que hacer un cast de EsComparable a Empleado
		Empleado e = (Empleado) c;
		
		return 
		}

}
