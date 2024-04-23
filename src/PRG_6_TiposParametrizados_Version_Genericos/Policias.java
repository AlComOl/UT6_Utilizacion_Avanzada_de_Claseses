package PRG_6_TiposParametrizados_Version_Genericos;
import java.util.Date; 
public class Policias {
	
	private Policias nombre;
	private Date fecha;
	
	
	
	public Policias() {
		
	}
	
	public Policias(Policias n, Date d) {
		this.nombre=n;
	}
	
	public Policias compara(Policias n) {
		
		if(!this.nombre.equals(n)) {
			if(this.fecha.after(fecha)) {
				
			}
		}
		return n;
	}

}
