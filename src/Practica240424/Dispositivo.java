package Practica240424;
import java.util.*;


public class Dispositivo  implements EsComparable<Dispositivo> {
	
	
	private static int incremento=0;
  //private String identificador;
	private String nombre;
	private int modelo;
	private String descripcion;
	private Date fechaadquisicion;
	private int id;
	
	public Dispositivo() {
		
	}
	
	public Dispositivo( String nombre, int modelo, String descripcion,Date fechaadquisicion) {
		incremento++;
		this.nombre=nombre;
		this.modelo=modelo;
		this.descripcion=descripcion;
		this.fechaadquisicion=fechaadquisicion;
	//	this.identificador=identificador+incremento++;
		this.id=incremento;
		
	}
//	public Dispositivo( String identificador,String nombre, int modelo, String descripcion,Date fechaadquisicion) {
//			
//			this.nombre=nombre;
//			this.modelo=modelo;
//			this.descripcion=descripcion;
//			this.fechaadquisicion=fechaadquisicion;
//			this.identificador=identificador+incremento++;
//			
//		}No sibe
	
	public int compara(Dispositivo d) {
	
		return this.id-(d.id);
	}

	@Override
	public String toString() {
		return "Dispositivo [identificador=" + getId() + ", nombre=" + nombre + ", modelo=" + modelo
				+ ", descripcion=" + descripcion + ", fechaadquisicion=" + fechaadquisicion + "]";
	}

	public String getId() {
		return "AA"+id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
