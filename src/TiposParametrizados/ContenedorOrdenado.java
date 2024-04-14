package TiposParametrizados;

/***********************************************
 *@autor Álvaro Comenge 
 *
 * @fecha  12/03/2024
 
 * @param <T>
 **********************************************/


public  class ContenedorOrdenado<T extends EsComparable <T>>{
//	ContenedorOrdenado asegura que los tipos que se utilizan con él proporcionen un método 
//	compara a través de la interfaz  EsComparable.<T extends EsComparable <T>>
	
		private T[ ] datos;//vector de datos generico de tipo T
		private int numEl;//
		
		public ContenedorOrdenado() {
			datos= (T[]) new EsComparable[10];
			
		}
		
		/***************
		 * //copara e inserta ordenado el valor
		 * 
		 *******************/
		public void inserta (T d){
		int i = 0 ;
		while ((i<numEl) && (datos[i].compara(d)<0)) { //ver donde va a ir el numero que quiero meter
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

		/*************************
		 * 
		 * @return todos los dat
		 * 
		 *************************/
		public String toString() {
			String cadena="";
			for(int i=0; i<numEl; i++) {
				cadena += datos[i] + "\n";
			}
			return cadena;
		}
		
	
}