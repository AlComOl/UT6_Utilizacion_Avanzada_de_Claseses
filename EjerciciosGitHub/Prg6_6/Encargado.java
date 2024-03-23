package Prg6_6;

public class Encargado extends Empleado{
	
	

	public Encargado() {
	
	}
	
	public Encargado(String nombre,double sueldo) {
		super(nombre,sueldo*1.10);
		
	}
	
	@Override
	public double getSueldo() {
		
		return super.sueldo;
	}

	@Override
	public String toString() {
		return "Encargado [sueldo=" + sueldo + ", nombre=" + nombre + "]";
	}
	
	
	
}
