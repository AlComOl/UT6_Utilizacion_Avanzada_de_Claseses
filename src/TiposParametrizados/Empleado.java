package TiposParametrizados;

public class Empleado implements EsComparable<Empleado>{
//Empleado implementa la interface EsComparable y da tipo a los elementos que meteremos en 	el atrributo de la clase ContenedorOrdenado que hereda de la interface
	//La clase Empleado implementa la interfaz EsComparable<Empleado>. 
	//Esto significa que Empleado proporciona una implementación para el método compara() 
	//definido en la interfaz EsComparable, y los elementos de Empleado pueden ser utilizados 
	//en el atributo de tipo genérico de la clase ContenedorOrdenado.
	private int sueldo;
	
//Constructor	
	public Empleado() {
		
	}
//Constructor con Parametros
	public Empleado(int sueldo) {
		this.sueldo=sueldo;
		
	}
//Metodo toString muestra el sueldo sobreescribe	
	public String toString() {
		return "Los sueldos ordenados son: "+sueldo;
	}
	//Este metodo compara es el que comentamos sobreescribe al metodo de la interface.
	@Override
	public int compara (Empleado c ){//nos ayuda a oredenar los sueldos(lo utilizamos en contenededor ordenado para comparar los elementos del array)
		int s=(int)(this.sueldo-c.sueldo);
		
		
		return s;
		}

}
