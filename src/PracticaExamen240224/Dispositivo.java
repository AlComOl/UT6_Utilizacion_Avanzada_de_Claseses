package PracticaExamen240224;
import java.util.*;




public class Dispositivo  implements EsComparable<Dispositivo>{
	
	//public int identificador;
	public static int incrementar=0;
	public String nombre;
	public int modelo;
	public String descripcion;
	public Date fechaAdquisicion;
	public int id;
	
	
	public Dispositivo() {
		
	}
	
	
	public Dispositivo(String nombre, int modelo, String descripcion, Date fechaAdquisicion) {
	//	this.identificador = incrementar;
		this.nombre = nombre;
		this.modelo = modelo;
		this.descripcion = descripcion;
		this.fechaAdquisicion = fechaAdquisicion;
		incrementar++;
		this.id=incrementar;
	}
//	este constructor es para eliminar el Dispositivo
//	public Dispositivo(String identificador,String nombre, int modelo, String descripcion, Date fechaAdquisicion) {
//		this.identificador = identificador;
//		this.nombre = nombre;
//		this.modelo = modelo;
//		this.descripcion = descripcion;
//		this.fechaAdquisicion = fechaAdquisicion;
//		
//	}


	@Override
	public String toString() {
		return "\n Dispositivo identificador= AA"+ id + ", nombre=" + nombre + ", modelo=" + modelo
				+ ", descripcion=" + descripcion + ", fechaAdquisicion=" + fechaAdquisicion;
	}


	


	@Override
	public int compara( Dispositivo t) {
		
		return	this.id-t.id;
		
		
		
	}
	
//	public boolean equals(int d) {//buscarDatoPos
//			
//			boolean iguales;
//			
//			if(this.identificador-(d.identificador)) {
//				iguales=true;
//			}else {
//				iguales=false;
//			}
//			
//			return iguales;
//			
//		}

}
