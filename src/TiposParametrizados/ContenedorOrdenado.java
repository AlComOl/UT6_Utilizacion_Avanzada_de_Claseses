package TiposParametrizados;
@SuppressWarnings("unchecked")


public  class ContenedorOrdenado<T extends EsComparable <T>>{
	
		private T[ ] datos;
		private int numEl;
		
		public ContenedorOrdenado() {
			datos= (T[]) new EsComparable[10];
			
		}
		
		public void inserta (T d){
		int i = 0 ;
		while ((i<numEl) && (datos[i].compara(d)<0)) {
			i++;
		}
		if (i<10) {
			for (int j=numEl; j>i; j--) {
				datos[j]=datos[j-1];
			}
		datos[i]=d;
		numEl++;
		}
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