package PracticaTiposParametrizados12423;
import java.util.*;

import TiposParametrizados.ContenedorOrdenado;
public class PruebaJugoteca {

	public static void main(String[] args) {
		int opcion=0;
		Scanner sc=new Scanner(System.in);
	
		ContenerdorOrdenado<Juego> nuevojuego=new ContenerdorOrdenado<Juego>();
		
		
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
                String nombre = sc.nextLine();
                System.out.println("Introduce el creador del juego:");
                String creador = sc.nextLine();
                System.out.println("Introduce la distribuidora del juego:");
                String distribuidora = sc.nextLine();
                System.out.println("Introduce la fecha de publicación del juego (en formato dd-MM-yyyy):");
                int dia, mes, anyo;
                
                dia = sc.nextInt();  
                mes = sc.nextInt();   
                anyo = sc.nextInt();   
                
                Date fecha = new Date(anyo,mes,dia);
                
                Juego j = new Juego(nombre, creador, distribuidora,fecha);
                nuevojuego.anyadeDatoOrdenado(j);
				
			break;
			case 2:
				System.out.println("Introduce juego a eliminar:");
				String buscar=sc.next();
				buscarDato(buscar);
              
                
			break;
			case 3:
				
			break;
			case 4:
			System.out.println(nuevojuego.numElementos());
			break;
			case 5:
				System.out.println(nuevojuego);	
			break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
		}while(opcion!=0);
		
		
		

	}

	

	

}
