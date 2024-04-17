package MetodosGenericos;


public class Empleado {
	
	private String nombre;
	private int edad;
	private double salario;

	
	public Empleado(String nom, int edad,double salario) {
		nombre=nom;
		edad=edad;
		salario=salario;
	}
	public String dameDatos() {
		return "El empleado se llama"+ nombre+"tiene "+ edad+ "y un salario de "+ salario;
	}
	

}
