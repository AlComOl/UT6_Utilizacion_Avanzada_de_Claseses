package TiposParametrizados;

public class Figura implements EsComparable{

	private int lado;
	
	public Figura() {
		
	}
	public Figura(int lado) {
		this.lado=lado;
	}
	
	public String toString() {
		return ;
	}
	
	public int compara (EsComparable c ){
		// Comparación de esta figura con la que pasan
		//Hay que hacer un cast de EsComparable a Figura
		Figura f = (Figura) c;
		
		
		return ;
		}
		
}
