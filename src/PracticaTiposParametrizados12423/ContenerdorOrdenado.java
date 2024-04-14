package PracticaTiposParametrizados12423;

import java.util.*;

public class ContenerdorOrdenado <T extends EsComparable<T>>{
	
	
	private Vector<T> datos;

	/** Construye un Contenedor de datos por defecto
	 * de 10 elementos
	 * 
	 */
	public ContenerdorOrdenado() {
		datos= new Vector<T>();
	}
	
	/**CONSTRUCTOR
	 * Construye un Contenedor de datos con parámetros de entrada:
	 * Capacidad int
	 * @return
	 */
	public ContenerdorOrdenado(int cap){
		datos= new Vector<T>(cap);
	}
	
	/**
	 * Nos indica si el contenedor esta o no lleno
	 * @return boolean
	 */
	private boolean contenedorLleno(){
		if (datos.size()==datos.capacity())
			return true;
		else
			return false;
	}
	
	/**
	 * Anyade un dato ordenado que le pasamos como parametro al contenedor
	 * @param dato
	 * @return booleano: Si se puede anyadir o no el dato al contenedor
	 */
	
	public boolean anyadeDatoOrdenado(T dato){
		boolean ok=false;
		
		
		int i=0;
		while (i<datos.size() && (dato.mayorQue(datos.elementAt(i))) ){//mayorque esta en contOrdenado donde se compara la fecha
			i++;
		}
		datos.add(i,dato);
		ok= true;
		
		return ok;
	}

	/**
	 * Metodo para obtener el dato que está en una determinada posición
	 * @param pos posición del elemento que queremos obtener
	 * @return el elemento que está en esa posición
	 */
	public T getDatoPos(int pos){
		T res;
		
			res= datos.elementAt(pos);
		
		return res;
	}
	
	/**
	 * Método para eliminar un dato del contenedor
	 * @param dato que queremos eliminar del contenedor
	 */
	public void eliminarDato(T dato){
		datos.removeElement(dato);
	}
	
	/**
	 * Método que deelve el número de datos actuales
	 * existentes en el contenedor
	 * @return número de datos del contenedor
	 */
	public int numElementos(){
		return datos.size();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		return "Contenedor [datos=" + datos + "]";
	}
	
	
	/**
	 * Método para buscar un dato en el contenedor
	 * @param dato a buscar
	 * @return booleano indicando si el dato se encuentra o no en el contenedor.
	 */
	public boolean buscarDato(T dato){
		boolean esta= false;
		
		int i=0;
		while ((i<datos.size())&&(!dato.equals(datos.elementAt(i))))
			i++;
		
		//Elemento esta en el vector
		if (i<datos.size())
			esta= true;
		return esta;
	}
	

	/**
	 * Método para buscar un dato en el contenedor
	 * @param dato a buscar
	 * @return entero indicando si la posicion del dato en el contenedor, -1 si no esta
	 */
	
	public int buscarDatoPos(T dato){//aqui se utiliza el metodo equals
		int pos=-1;
		
		int i=0;
		while ((i<datos.size())&&(!dato.equals(datos.elementAt(i))))//si dato no es true continua
			i++;
		
		//Elemento esta en el vector
		if (i<datos.size())
			pos=i;
		
		return pos;
	}
}
