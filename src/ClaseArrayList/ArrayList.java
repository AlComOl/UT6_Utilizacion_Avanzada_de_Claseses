package ClaseArrayList;

public class ArrayList {
	
	private Object[] datosElemento;
	
	private int i=0; 
	
	
	public ArrayList(int posiciones) {//constructor
		
		datosElemento =new Object[posiciones];
	}
	
	public Object get(int i) {
		return datosElemento[i];
	}
	
	public void add(Object o) {//recibe el tipo obgeto y se almacena en la posicion, ayudado por la clase contador
		
		datosElemento[i]=o;
		
		i++;
	}
}
