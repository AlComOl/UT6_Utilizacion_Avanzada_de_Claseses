package Prg6_11;

public class Circulo extends Forma{
	
	protected int identidicador;

	public Circulo(int identificador) {
		super(identificador);
		
	}

	@Override
	public String toString() {
		
		return "El identificador es:"+ identificador;
	}

}
