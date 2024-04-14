package TiposParametrizados;
/*************************
 * @autor Álvaro Comenge 
 * 
 * @fecha 13/03/2024
 * 
 * Clase Empleado
 *************************/

public class Empleado implements EsComparable<Empleado>{
	
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
/*************************************************
 * Metodo toString muestra el sueldo 
 * sobreescribe a toString 	
 ***********************************************/
	public String toString() {
		return "Los sueldos ordenados son: "+sueldo;
	}
	/*****************
	 * Sobreescribe al metodo de la interface.
	 * nos ayuda a oredenar los sueldos(lo utilizamos en contenededor ordenado para 
	 * comparar los elementos del array)
	 * @return devuelve 
	 *********************/
	@Override
	public int compara (Empleado c ){
		int s=(int)(this.sueldo-c.sueldo);
		
		
		return s;
		}

}
