package RecuperacionPracticas2Eva;

public class Pelicula extends Obra{
	
	private float duracion;
	
	public Pelicula(String titulo,String any,float d ) {
		super(titulo,any);
		
		this.duracion=d;
	}

	public float getDuracion() {
		return duracion;
	}

	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}


	
	 @Override
	    public String toString() {
	        return "Pelicula [titulo=" + getTitulo() + ", anyo=" + anyo + ", duracion=" + duracion + "]";
	    }

}
