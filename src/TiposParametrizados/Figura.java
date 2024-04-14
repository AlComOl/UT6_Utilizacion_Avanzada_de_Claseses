package TiposParametrizados;
/*************************
 * @autor Álvaro Comenge 
 * 
 * @fecha 13/03/2024
 * 
 * Clase Figura
 *************************/
// La clase figura implementa el interface EsComparable
public class Figura implements EsComparable <Figura>{

	private int lado;//atributo 
	
	public Figura() {//constructor
		
	}
	public Figura(int lado) {//constructor parametros
		this.lado=lado;
	}
	@Override
	public String toString() {
		
		return "los lados de la figura son :"+lado;
	}
	@Override
	public int compara (Figura c ){//restar el dato con el objeto 
		int s=(int)(this.lado-c.lado);
		
		return s;
		}
		
}
