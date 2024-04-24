package Practica240424;

import java.util.Date;
import java.util.Scanner;



public class TestDispositivos {
	
	public static void main(String[] args) {
		int opcion=0;
		String nombre,descripcion;
		Date fecha;
		int dia, mes, anyo, modelo;
		Dispositivo d;
		Scanner sc=new Scanner(System.in);
	
		ContenedorOrdenado<Dispositivo> ateca=new ContenedorOrdenado<Dispositivo>();
		
		
		do {
			
			System.out.println("1. Añadir Dispositivo\r\n"
					+ "2. Eliminar Dispositivo\r\n"
					+ "3. Número de Dispositivos existentes en la Aula Ateca\r\n"
					+ "4. Mostrar dispositivos del Aula Ateca\r\n"
					+ "5. Añadir unas GafasRV\r\n"
					+ "6.Mostrar todas las gafas del aula Ateca");
			opcion=sc.nextInt();
			
			switch (opcion) {
			case 1: 
				sc.nextLine(); // Limpia el buffer del scanner
                System.out.println("Introduce el nombre del Dispositivo:");
                 nombre = sc.nextLine();
                System.out.println("Introduce el modelo del Dispositivo:");
                 modelo = sc.nextInt();
                 sc.nextLine();
                System.out.println("Introduce la descripcion del dispositivo:");
                 descripcion = sc.nextLine();
                System.out.println("Introduce la fecha de publicación del Dispositivo (en formato dd-MM-yyyy):");
                
                System.out.println("Introduce dia:");
                dia = sc.nextInt();
                System.out.println("Introduce mes:");
                mes = sc.nextInt();   
                System.out.println("Introduce anyo:");
                anyo = sc.nextInt();   
                
                 fecha = new Date(anyo,mes,dia);
                
                 d = new Dispositivo(nombre, modelo, descripcion,fecha);
                ateca.anyadeDatoOrdenado(d);
				
			break;
//						
			case 2:
				System.out.println("Introduce Dispositivo a eliminar:");
				
				 d = new Dispositivo();
				 sc.nextLine(); // Limpia el buffer del scanner
	                System.out.println("Introduce el nombre del Dispositivo:");
	                 nombre = sc.nextLine();
	                System.out.println("Introduce el modelo del Dispositivo :");
	                 modelo = sc.nextInt();
	                 sc.nextLine();
	                System.out.println("Introduce la descripcion del Dispositivo:");
	                 descripcion = sc.nextLine();
	                System.out.println("Introduce la fecha de publicación del Dispositivo (en formato dd-MM-yyyy):");
	                
	                System.out.println("Introduce dia:");
	                dia = sc.nextInt();
	                System.out.println("Introduce mes:");
	                mes = sc.nextInt();   
	                System.out.println("Introduce anyo:");
	                anyo = sc.nextInt();   
	                
	                 fecha = new Date(anyo,mes,dia);
	                
	                 d = new Dispositivo(nombre, modelo, descripcion,fecha);
	                 
	                 if(ateca.buscarDato(d)==true) {//si esta lo borro 
	                	 ateca.eliminarDato(d);
	                 }else {
	                	 System.out.println("El Dispositivo no esta en la coleccion");
	                 }
				
              
                
			break;
		 					  	
			case 3:
				System.out.println(ateca.numElementos());
			break;
			case 4:
				System.out.println(ateca.toString());	
			break;
			case 5:
				
			break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
		}while(opcion!=0);
		
		
		

	}
	}


