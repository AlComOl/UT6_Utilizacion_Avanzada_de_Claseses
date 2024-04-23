package PRG_6_TiposParametrizados_Version_Genericos;
import java.util.Date; 
public class Policias implements EsComparable6<Policias>{
	
	private String nombre;
	private int edad;
	
	
	
	public Policias() {
		
	}
	
	public Policias(String n,int e) {
		this.nombre=n;
		this.edad=e;
	}
	
	public int compara(Policias n) {
		
		return	this.edad-n.edad;
		
	}
	
	public String toString() {
		return " "+nombre + " "+" "+edad;
	}

}
