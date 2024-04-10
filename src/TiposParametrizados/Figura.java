package TiposParametrizados;

public class Figura implements EsComparable <Figura>{

	private int lado;
	
	public Figura() {
		
	}
	public Figura(int lado) {
		this.lado=lado;
	}
	
	public String toString() {
		String d=" ";
		return d;
	}
	
	public int compara (Figura c ){//restar el dato con el objeto 
		int s=(this.lado-c.lado);
		
		
		
		return s;
		}
		
}
