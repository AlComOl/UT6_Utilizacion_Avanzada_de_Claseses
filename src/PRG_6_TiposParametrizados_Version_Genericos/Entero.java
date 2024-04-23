package PRG_6_TiposParametrizados_Version_Genericos;

public class Entero implements EsComparable6<Entero>{

	private int numero;
	
	public Entero(int numero) {
		
	}
	
	@Override
	public int compara(Entero t) {
		
		int res=0;
		
		res=numero-t.numero;
		
		return res;
	}
	
	

}
