package PracticaTiposParametrizados12423;

import java.util.Date; 
public class Juego implements EsComparable<Juego> {
	
	private String nombre;
	private String creador;
	private String distribuidora;
	private Date fechaPublicacion;
	
	public Juego() {
		
	}
	
	public Juego(String nombre,String creador,String distribuidora,Date fechaPublicacion) {
		this.nombre=nombre;
		this.creador=creador;
		this.distribuidora=distribuidora;
		this.fechaPublicacion=fechaPublicacion;
		
	}
	
	
	public boolean equals(Juego juego) {//buscarDatoPos
		
		boolean iguales;
		
		if(this.nombre == juego.nombre&&this.creador == juego.creador&&this.distribuidora == juego.distribuidora && this.fechaPublicacion == juego.fechaPublicacion) {
			iguales=true;
		}else {
			iguales=false;
		}
		
		return iguales;
		
	}


	@Override
	public boolean mayorQue(Juego t) {
		boolean noMayor = true;
		if(t.fechaPublicacion.getYear()>this.fechaPublicacion.getYear()) {
			noMayor = false;
		}else {
			
			if(t.fechaPublicacion.getYear()==this.fechaPublicacion.getYear()) {
				if(t.fechaPublicacion.getMonth()>this.fechaPublicacion.getMonth()) {
					noMayor = false;
				}else {
					if(t.fechaPublicacion.getMonth()==this.fechaPublicacion.getMonth()) {	
						if(t.fechaPublicacion.getDay()>this.fechaPublicacion.getDay()) {
							noMayor = false;
						}
					}
				}
			}
		}
		return noMayor;
	}
	/*REFACTORIZADA
	 * public boolean mayorQue(Juego t) {
			    boolean resultado = true;
			
			    if (t.fechaPublicacion.getYear() > this.fechaPublicacion.getYear()) {
			        resultado = false;
			    } else if (t.fechaPublicacion.getYear() == this.fechaPublicacion.getYear()) {
			        if (t.fechaPublicacion.getMonthValue() > this.fechaPublicacion.getMonthValue()) {
			            resultado = false;
			        } else if (t.fechaPublicacion.getMonthValue() == this.fechaPublicacion.getMonthValue()) {
			            resultado = t.fechaPublicacion.getDayOfMonth() > this.fechaPublicacion.getDayOfMonth();
			        }
			    }
			    
			    return resultado;
			}
	 * 
	 */
	
	
	@Override
	public String toString() {
		return "Los juegos son :"+this.nombre+"\n"+this.creador+this.distribuidora+"\n"+this.fechaPublicacion;
	}
	
	
	
	

}
