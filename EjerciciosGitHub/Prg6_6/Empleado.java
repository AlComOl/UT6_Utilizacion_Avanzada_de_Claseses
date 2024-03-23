package Prg6_6;

public class Empleado {
	
	protected double sueldo;
	protected String nombre;
	
	public Empleado() {
			
	}
	public Empleado(String nombre,double sueldo) {
		this.sueldo=sueldo;
		this.nombre=nombre;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", nombre=" + nombre + "]";
	}

}
