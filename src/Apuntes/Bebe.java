package Apuntes;


//	public class Bebe { 
//		static Bebe bebe1 = new Bebe (); 
//		static Bebe bebe2 = new Bebe (); 
//		static Bebe bebe3 = new Bebe (); 
//		static String str2, str3,str1 = "papa tengo caca"; 
//		static { 
//		str2 = "mama pipi"; 
//		str3 = "mama agua"; 
//		} 
//		//métodos 
//		Bebe() { System.out.println("Nacimiento del bebe"); } 
//		static void pedir() { 
//		System.out.println(str1 + " , " + str2 + " , " + str3); 
//		} 
//		public static void main(String[] args) { 
//		System.out.println("El bebe se ha despertado y va a pedir cosas"); 
//		System.out.println("El bebe dice: " + Bebe.str1); //papa tengo caca
//		Bebe.pedir(); //papa tengo caca  mama pipi mama agua
//		} 
//		} 

public class Bebe {
	static void pedir(String... argumentos) { 
		for(String str : argumentos) System.out.println(str); 
	}
	public static void main(String[] args) {
		
	pedir("mama pipi", "mama caca", "mama agua,\n*******fin primera llamada"); 
	
	pedir(new String[]{"papa jugar", "mama me aburro", "papa sed", "papa dormir", "mama tengo hambre"}); 
	} 
	}




