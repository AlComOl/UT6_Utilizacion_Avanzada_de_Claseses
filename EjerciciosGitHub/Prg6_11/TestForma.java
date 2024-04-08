package Prg6_11;

public class TestForma {
//
//	public static void main(String[] args) {
//		
//		Circul c=new Circul();
//		Circul c1=new Circul();
//		Cuadrado f=new Cuadrado();
//		Triangulo t=new Triangulo();
//		Rombo r=new Rombo();
//		
//		
//	
//		System.out.println(c.toString());
//		System.out.println(c1.toString());
//		System.out.println(f.toString());
//		System.out.println(t.toString());
//		System.out.println(r.toString());
//		
//
//	}
//
//}
		public static void main (String [] args){ 
			 Forma f= new Circul(); 
		System.out.println( f.getIdentificador()); 
			 Circul c=new Circul();
		//((Forma.C).identidad(); 
			 ((Circul)f).getIdentificador() ;
//			 Forma f2 = new Forma();
//			 f2.identidad();
//			 (forma)f.identidad(); 
			 } 
		} 