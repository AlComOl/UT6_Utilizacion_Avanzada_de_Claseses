package TiposParametrizados;

public class Empleado implements EsComparable<Empleado>{
	
	private int sueldo;
	
	
	public Empleado() {
		
	}
	public Empleado(int sueldo) {
		this.sueldo=sueldo;
		
	}
	
	public String toString() {
		return "Los sueldos son"+sueldo;
	}
	
	@Override
	public int compara (Empleado c ){
		int s=this.sueldo-c.sueldo;
		
		
		return s;
		}

}
