package PracticaTiposParametrizados12423;
import java.util.*;


public class PruebaJugoteca {

	public static void main(String[] args) {
		int opcion=0;
		String nombre,creador,distribuidora;
		Date fecha;
		int dia, mes, anyo;
		Juego j;
		Scanner sc=new Scanner(System.in);
	
		ContenerdorOrdenado<Juego> coleccionJuegos=new ContenerdorOrdenado<Juego>();
		
		
		do {
			System.out.println("introduce opcion");
			System.out.println("1. Añadir juego\r\n"
					+ "2. Eliminar juego\r\n"
					+ "3. Obtener juego más antiguo\r\n"
					+ "4. Número de juegos existentes en la juegoteca\r\n"
					+ "5. Mostrar juegoteca");
			opcion=sc.nextInt();
			
			switch (opcion) {
			case 1: 
				sc.nextLine(); // Limpia el buffer del scanner
                System.out.println("Introduce el nombre del juego:");
                 nombre = sc.nextLine();
                System.out.println("Introduce el creador del juego:");
                 creador = sc.nextLine();
                System.out.println("Introduce la distribuidora del juego:");
                 distribuidora = sc.nextLine();
                System.out.println("Introduce la fecha de publicación del juego (en formato dd-MM-yyyy):");
                
                System.out.println("Introduce dia:");
                dia = sc.nextInt();
                System.out.println("Introduce mes:");
                mes = sc.nextInt();   
                System.out.println("Introduce anyo:");
                anyo = sc.nextInt();   
                
                 fecha = new Date(anyo,mes,dia);
                
                 j = new Juego(nombre, creador, distribuidora,fecha);
                coleccionJuegos.anyadeDatoOrdenado(j);
				
			break;
//						Eliminar juego
			case 2:
				System.out.println("Introduce juego a eliminar:");
				String buscar=sc.next();
				 j = new Juego();
				 sc.nextLine(); // Limpia el buffer del scanner
	                System.out.println("Introduce el nombre del juego:");
	                 nombre = sc.nextLine();
	                System.out.println("Introduce el creador del juego:");
	                 creador = sc.nextLine();
	                System.out.println("Introduce la distribuidora del juego:");
	                 distribuidora = sc.nextLine();
	                System.out.println("Introduce la fecha de publicación del juego (en formato dd-MM-yyyy):");
	                
	                System.out.println("Introduce dia:");
	                dia = sc.nextInt();
	                System.out.println("Introduce mes:");
	                mes = sc.nextInt();   
	                System.out.println("Introduce anyo:");
	                anyo = sc.nextInt();   
	                
	                 fecha = new Date(anyo,mes,dia);
	                
	                 j = new Juego(nombre, creador, distribuidora,fecha);
	                 
	                 if(coleccionJuegos.buscarDato(j)==true) {//si esta lo borro 
	                	 coleccionJuegos.eliminarDato(j);
	                 }else {
	                	 System.out.println("El juego no esta en la coleccion");
	                 }
				
              
                
			break;
//		 					Obtener juego más antiguo  	
			case 3:
				
			break;
			case 4:
			System.out.println(coleccionJuegos.numElementos());
			break;
			case 5:
				System.out.println(coleccionJuegos);	
			break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
		}while(opcion!=0);
		
		
		

	}

	

	

}
