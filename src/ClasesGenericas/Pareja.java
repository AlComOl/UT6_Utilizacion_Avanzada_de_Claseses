package ClasesGenericas;

public class Pareja<T> {//<T> se les llama clases genericas T,U,K 

	private T primero;
	
	public Pareja() {
		primero=null;
	}
	
	public void setPrimero(T nuevoValor) {
		this.primero=nuevoValor;
	}
	
	public T getPrimero() {
		
		return primero;
	}
}
