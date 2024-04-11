package TiposParametrizados;

public class Figura implements EsComparable <Figura>{

	private int lado;
	
	public Figura() {
		
	}
	public Figura(int lado) {
		this.lado=lado;
	}
	
	public String toString() {
		
		return "los lados de la figura son :"+lado;
	}
	
	public int compara (Figura c ){//restar el dato con el objeto 
		int s=(int)(this.lado-c.lado);
		
		return s;
		}
		
}
