package Practica240424;
import java.util.*;


public class Dispositivo  implements EsComparable<Dispositivo> {
	
	
	private static int incremento=0;
	private int identificador;
	private String nombre;
	private int modelo;
	private String descripcion;
	private Date fechaadquisicion;
	
	public Dispositivo() {
		
	}
	
	public Dispositivo( String nombre, int modelo, String descripcion,Date fechaadquisicion) {
		
		this.nombre=nombre;
		this.modelo=modelo;
		this.descripcion=descripcion;
		this.fechaadquisicion=fechaadquisicion;
		this.identificador=incremento++;
		
	}
	
	public int compara(Dispositivo d) {
	
		return this.identificador-(d.identificador);
	}

	@Override
	public String toString() {
		return "Dispositivo [identificador=" + identificador + ", nombre=" + nombre + ", modelo=" + modelo
				+ ", descripcion=" + descripcion + ", fechaadquisicion=" + fechaadquisicion + "]";
	}
	
	
}
