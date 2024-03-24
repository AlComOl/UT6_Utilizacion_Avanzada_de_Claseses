package Polimorfismo;
import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {
	
	private String nombre;
	private double sueldo;
	private int anyo;
	private int mes;
	private int dia;
	private Date altaContrato;
	private int Id;
	private static int IdSiguiente;
	
	public Empleado(String nom, double sue,int anyo, int mes,int dia) {
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(anyo,mes-1,dia);
		altaContrato=calendario.getTime();
		++IdSiguiente;
		Id=IdSiguiente;
	}
	public Empleado(String nom) {
		this(nom,30000,2000,01,01);
		
	}
	public String getNombre() {//getter
		return nombre+"Id: "+Id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldo() {//getter
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public Date getAltaContrato() {//getter
		return altaContrato;
	}
	public void setAltaContrato(Date altaContrato) {
		this.altaContrato = altaContrato;
	}
	public void subeSueldo(double porcentaje) {//setter
		double aumento=sueldo*porcentaje/100;
		sueldo+=porcentaje;
	}
	
	

}
