package TiposParametrizados;



public  class ContenedorOrdenado<T extends EsComparable <T>>{
	
		private T[ ] datos;
		private int numEl;
		
		public ContenedorOrdenado() {
			datos= (T[]) new EsComparable[10];
		}
		
		public void inserta (T d){
		int i = 0 ;
		while ((i<numEl) & (datos[i].compara(d)<0)) {
			i++;
		}
		
		datos[i]=d;
		}
		public int compara(EsComparable c) {
			
			return 0;
		}
		
		public String toString() {
			String cadena="";
			for(int i=0; i<numEl; i++) {
				cadena += datos[i] + "\n";
			}
			return cadena;
		}
		
	
}