package RecuperacionPracticas2Eva;


import java.util.*;

public abstract class Obra implements InterfaceObra {
	private static int incremento=0;
	protected ArrayList <autor> autores;
 	protected int IdObra;
	protected String titulo;
	protected String anyo;
	
	
	
	
	public Obra() {
		incremento++;
		this.autores = new ArrayList<autor>();
		this.IdObra=incremento;
		
	}
	
	public Obra(String titulo,String any) {
		incremento++;
		this.autores = new ArrayList<autor>();
		this.IdObra=incremento;
		this.titulo=titulo;
		this.anyo=any;
		
	}

	

	public String getTitulo() {
		return titulo;
	}
	
	/**
	 * Este metodo es para anyador los autores y no anyade mas de 3 
	 * @param a
	 */
	public void addAutor(autor a) {
		
		if(autores.size()<3) {
			
			autores.add(a);
		}
	}
	/**
	 * Este metodo es para borrar los autores 
	 * @param a
	 */
	public void deleteAutor(autor a) {
			
		autores.remove(a);
			
	}
	
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Obra [autores=" + autores.toString() + ", IdObra=" + IdObra + ", titulo=" + titulo + ", anyo="
				+ anyo + "]";
	}
	
	public void eliminarObra() {
		
	}
	 @Override
	    public int getAutores() {
		 
	
			return autores.size();
	 }    
	

}
