package Prg6_11;

public abstract class Forma {
	
	
	
	protected int identificador;
	
	public Forma(int identificador){
		this.identificador=identificador;	
	}
	
	public abstract String toString();
	
	public int  identidad() {
		return identificador;
	}

}
