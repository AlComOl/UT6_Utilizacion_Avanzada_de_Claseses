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
 
//	el progrma muestra 3 veces el mensaje de getidentificador
		public static void main (String [] args){ 
			 Forma f= new Circul(); 
		System.out.println(f.getIdentificador());
			 Circul c=new Circul();//la C es minuscula
//			 ((Forma)c).getIdentificador();circulo hereda de foma no hay que hacer casting 
			 System.out.println(c.getIdentificador());
//			 ((Circul)f).getIdentificador() ;este metodo ya pertenece a forma
			 System.out.println(f.getIdentificador());
//			 Forma f2 = new Forma();//Forma es una clase abstract y no se puede instanciar
//			 f2.identidad();
//			 (forma)f.identidad(); 
			 } 
		} 