package PracticaExamen240224;

import java.util.Date;
import java.util.Scanner;



public class PruebaAteca {

	public static void main(String[] args) {
			
			
			Scanner sc=new Scanner(System.in);
			int opcion=0,modelo,capacidad;
			String identificador;
			String nombre,descripcion;
			Date fecha;
			int dia, mes, anyo;
			double gafas;
			
			Dispositivo d;
			GafasRV g;
			
		
			ContenedorOrdenado<Dispositivo> Ateca=new ContenedorOrdenado<Dispositivo>();
			
			
			do {
				
				System.out.println("1. Añadir dispositivo\r\n"
						+ "2. Eliminar Dispositivo\r\n"
						+ "3. Número de dispositivos inventariados en el aula \r\n"
						+ "4. Mostrar dispositivos Aula Ateca \r\n"
						+ "5. Anyadir unas gafas RV \r\n"
						+ "6. Mostrar todas las gafas ");
				opcion=sc.nextInt();
				 sc.nextLine(); // Limpia el buffer del scanner
				switch (opcion) {
				case 1: 
				
	                System.out.println("Introduce el nombre:");
	                nombre = sc.nextLine();
	                System.out.println("Introduce el modelo (INT):");
	                 modelo = sc.nextInt();
	                 sc.nextLine(); // Limpia el buffer del scanner
	                System.out.println("Introduce la descripcion:");
	                 descripcion = sc.nextLine();
	                System.out.println("Introduce la fecha de publicación del juego (en formato dd-MM-yyyy):");
	                
	                System.out.println("Introduce dia:");
	                dia = sc.nextInt();
	                sc.nextLine(); // Limpia el buffer del scanner
	                System.out.println("Introduce mes:");
	                mes = sc.nextInt();   
	                sc.nextLine(); // Limpia el buffer del scanner
	                System.out.println("Introduce anyo:");
	                anyo = sc.nextInt();   
	                sc.nextLine(); // Limpia el buffer del scanner
	                
	                 fecha = new Date(anyo,mes,dia);
	                
	                 d = new Dispositivo( nombre,modelo,descripcion,fecha);
	                 Ateca.anyadeDatoOrdenado(d);
					
				break;
//							Eliminar dispositivo
				case 2:
					System.out.println("Introduce id del juego a eliminar:");
					
					 d = new Dispositivo();
					
//					 	System.out.println("Introduce el identificador:");
//		                identificador = sc.nextLine();
//		                System.out.println("Introduce el nombre:");
//		                nombre = sc.nextLine();
//		                System.out.println("Introduce modelo:");
//		                modelo = sc.nextInt();
//		                sc.nextLine();
//		                System.out.println("Introduce la descripcion:");
//		                descripcion = sc.nextLine();
//		                System.out.println("Introduce la fecha de publicación del juego (en formato dd-MM-yyyy):");
//		                
//		                System.out.println("Introduce dia:");
//		                dia = sc.nextInt();
//		                System.out.println("Introduce mes:");
//		                mes = sc.nextInt();   
//		                System.out.println("Introduce anyo:");
//		                anyo = sc.nextInt();   
//		                
//		                 fecha = new Date(anyo,mes,dia);
//		                
//		                 d = new Dispositivo(identificador,nombre, modelo, descripcion,fecha);
		                 int id=sc.nextInt();
		                 
		                 d=Ateca.getDatoPos(id-1);
		                 
		                 Ateca.eliminarDato(d);
//		                 if(Ateca.buscarDatoPos(id)==true) {//si esta lo borro 
//		                	 System.out.println("Elemento encontrado procedo a eliminarlo");
//		                	 Ateca.eliminarDato(d);
//		                 }else {
//		                	 System.out.println("El juego no esta en la coleccion");
//		                 }
				
				break;
//			 						
				case 3:
					System.out.println("Hay "+Ateca.numElementos()+" en el Aulateca");
				break;
				case 4:
					System.out.println(Ateca.toString());
				break;
				case 5:
					System.out.println("Introduce la version de las gafas");
					gafas=sc.nextDouble();
					System.out.println("Introduce la capacidad en megas con un numero entero");
					capacidad=sc.nextInt();
					
					g=new GafasRV(gafas,capacidad); 
					
					Ateca.anyadeDatoOrdenado(g);
					
					
					
					
				break;
				case 6:
					System.out.println(Ateca.toString());
					
				break;
				
				default:
					throw new IllegalArgumentException("Unexpected value: " + opcion);
				}
			}while(opcion!=0);
			
			
			

		}
	

	}


