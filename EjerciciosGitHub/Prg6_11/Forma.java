	package Prg6_11;
	
	public abstract class Forma {
		
		
		
		public int identificador;
		public static int id=0;
		
		public Forma() {
			this.identificador=id;
			id++;
		}
		
		public Forma(int identificador){
			this.identificador=identificador;	
		}
		
		public abstract String toString();
		
		public int  getIdentificador() {
			return identificador;
		}
	
	}
