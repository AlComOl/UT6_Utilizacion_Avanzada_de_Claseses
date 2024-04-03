package Prg6_11;

public class Triangulo extends Forma{
	
	protected int identificador ;
	

	public Triangulo(int identificador) {
		super(identificador);
		this.identificador=identificador;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "El identificador es:"+identificador;
	}

}
