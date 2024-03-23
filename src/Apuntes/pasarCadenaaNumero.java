package Apuntes;

public class pasarCadenaaNumero {

	public static void main(String[] args) {
		

	}

		public static int cambiar(String cad){
			int num =0;
			for(int i=0;i<cad.length();i++) {
				num*=10;
				num+=cad.charAt(i)-0;
			}
			return num;
			}
		
}
