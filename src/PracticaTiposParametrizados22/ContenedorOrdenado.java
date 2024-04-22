/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTiposParametrizados22;
import java.util.Vector;
/**
 *
 * @author acome
 * @param <T>
 */
public class ContenedorOrdenado<T extends esComparable<T>> {
	private Vector<T> datos;
	/*Construye un Contenedor de datos por defecto de 10 elementos*/
	public ContenedorOrdenado() {
		datos= new Vector<T>();
	}
	
	/*Construye un Contenedor de datos con par�metros de entrada:
	   Capacidad int 
	   * @return */
	public ContenedorOrdenado(int cap){
		datos= new Vector<T>(cap);
	}
	
	/*Nos indica si el contenedor esta o no lleno
	 @return boolean*/ 
	private boolean contenedorLleno(){
		boolean rdo;
		if (datos.size()==datos.capacity())
			rdo = true;
		else
			rdo = false;
		return rdo;
	}
	
	/*Anyade un dato ordenado que le pasamos como parametro al contenedor
	* @param dato
	* @return booleano: Si se puede anyadir o no el dato al contenedor
	*/
	public boolean anyadeDatoOrdenado(T dato){
		boolean ok=false;
		int i=0;
		while (i<datos.size() && (dato.mayorQue(datos.elementAt(i)))){
			i++;
		}
		datos.add(i,dato);
		ok= true;
		return ok;
	}
	
	/*Metodo para obtener el dato que est� en una determinada posici�n
	@param pos posici�n del elemento que queremos obtener
	@return el elemento que est� en esa posici�n*/
	public T getDatoPos(int pos){
		T res;
		res= datos.elementAt(pos);
		return res;
	}
	
	/*Metodo para obtener el dato que est� en una determinada posici�n
	 @param pos posici�n del elemento que queremos obtener
	 @return el elemento que est� en esa posici�n*/
	public T obtenerDatoPos(int pos){
		T res;
		res= datos.elementAt(pos);
		return res;
	}
	
	/*M�todo para eliminar un dato del contenedor
	 @param dato que queremos eliminar del contenedor*/
	public boolean eliminarDato(T dato){
                
		return datos.removeElement(dato);//aqui es donde no me aclaro.
	}
 	//public void eliminarDato(Libro dato){
	//	datos.removeElement(dato);
	//		System.out.println("Eliminado");
	//}
	

       // public void eliminarDato(int dato){
       // datos.remove(dato);
        //}
 
	
	/*M�todo que devuelve el n�mero de datos actuales existentes en el contenedor
	 @return n�mero de datos del contenedor*/
	public int numElementos(){
		return datos.size();
	}
	
	/*(non-Javadoc) 
	 @see java.lang.Object#toString()*/
	@Override
	public String toString() {
		return "Contenedor [datos=" + datos + "]";
	}
	
	/*M�todo para buscar un dato en el contenedor
	 @param dato a buscar
	 @return booleano indicando si el dato se encuentra o no en el contenedor.*/
	public boolean buscarDato(T dato){
		boolean esta= false;
		int i=0;
		while ((i<datos.size())&&dato.mayorQue(datos.elementAt(i)))
			i++;
			//Elemento esta en el vector
		if (i<datos.size())
			esta= true;
		return esta;
	}
	
	/*M�todo para buscar un dato en el contenedor
	 @param dato a buscar
	 @return entero indicando si la posicion del dato en el contenedor, -1 si no esta*/
	public int buscarDatoPos(T dato){
		int pos=-1;
		int i=0;
		while ((i<datos.size())&&dato.mayorQue(datos.elementAt(i)))
			i++;
			//Elemento esta en el vector
		if (i<datos.size())
			pos=i;
		return pos;
	}
        
        

}