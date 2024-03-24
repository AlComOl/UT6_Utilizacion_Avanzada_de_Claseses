package Polimorfismo;

public class Jefatura extends Empleado{
	
	private double incentivo;

	public Jefatura(String nom,int sue, int anyo,int mes,int dia) {
		super(nom, sue,anyo,mes,dia);
		
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void estableceIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	public double getSueldo() {
		
		double sueldoJefe=super.getSueldo()+incentivo;//hay que poner el super para que llame al metodo del super.
		
		return sueldoJefe;
	}
	

}
