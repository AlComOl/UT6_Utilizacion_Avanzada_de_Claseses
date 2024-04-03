package Prg6_11;

public class Rombo extends Forma{
	
	protected int identificador;

	public Rombo(int identificador) {
		super(identificador);
		this.identificador=identificador;
		
	}

	@Override
	public String toString() {
		
		return "El identificador es "+ identificador;
	}
	

}
