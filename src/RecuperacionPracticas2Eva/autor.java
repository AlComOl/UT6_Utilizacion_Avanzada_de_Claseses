package RecuperacionPracticas2Eva;

public class autor {
	static int incremento=0;	
	private int Idautor;
	private String nombre;
	private String pais;
	
	
	public autor(String n, String p){
		 incremento++;
		 this.Idautor=incremento;
		 this.nombre=n;
		 this.pais=p;
		 
		 
	}
	
	public void anyadirAutor() {
		
	}

	@Override
	public String toString() {
		return "autor [Idautor=" + Idautor + ", nombre=" + nombre + ", pais=" + pais + "]";
	}
	
	
}
