package TiposParametrizados;



public  class ContenedorOrdenado<T extends EsComparable>{
	
		private T[ ] datos;
		private int numEl;
		public void inserta (T d){
		int i = 0 ;
		int cont=0;
		while ((i<numEl) & (datos[i].compara(d)<0))
			i++;
		
		}
		
	
		public int compara(EsComparable c) {
			
			return 0;
		}
		
		}
