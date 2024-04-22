/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package PracticaTiposParametrizados22;
import java.util.*;
/**
 *
 * @author acome
 */
public class PracticaUt62021 {

    public static void main(String[] args) {
        
      //  Biblioteca biblio=new Biblioteca("IES Fuente San Luis");
        
        Scanner sc=new Scanner(System.in);
        int opcion=0;
        int viejo=0;
        String titulo, autor,editorial;
        double Precio;
        int anio;
        boolean salir=false;
        ContenedorOrdenado <Libro> biblio = new  ContenedorOrdenado <Libro>();
        
            
        while(!salir){
             System.out.println("""
                           1. A\u00f1adir libro
                           2. Eliminar libro
                           3. Obtener libro m\u00e1s antiguo
                           4. N\u00famero de libros existentes en la biblioteca
                           5. Mostrar libros biblioteca
                           0. Salir""");
             opcion=sc.nextByte();
            switch (opcion) {
                case 1:
                    sc.nextLine();
            	System.out.println("Introduce t�tulo: ");
            	 titulo = sc.nextLine();
            	
            	System.out.println("Autor: ");
            	 autor = sc.nextLine();
            	
            	System.out.println("Editorial: ");
            	 editorial = sc.nextLine();
                
                System.out.println("Precio");
            	 Precio=sc.nextDouble();
            	
            	System.out.println("Anio: ");
            	 anio = sc.nextInt();
        
               Libro l1=new Libro(titulo,autor,editorial,Precio,anio);
               
                biblio.anyadeDatoOrdenado(l1);
                    break;
                case 2:
                    System.out.println("Introduce titulo del libro a Eliminar");
                   sc.nextLine();
                    System.out.println("Introduce t�tulo: ");
                     titulo = sc.nextLine();

                    System.out.println("Autor: ");
                     autor = sc.nextLine();

                    System.out.println("Editorial: ");
                     editorial = sc.nextLine();

                    System.out.println("Precio");
                     Precio=sc.nextDouble();

                    System.out.println("Anio: ");
                     anio = sc.nextInt();
                     
                    Libro l2=new Libro(titulo,autor,editorial,Precio,anio);
                    
                        for(int i=0;i<biblio.numElementos();i++){
                            if(l2.equals(biblio.getDatoPos(i))){
                            biblio.eliminarDato(biblio.getDatoPos(i));
                           }
                        }
                    break;
                case 3:
                    for(int i=0;i<biblio.numElementos();i++){
                        if(biblio.getDatoPos(i).getanyopublicacion()<biblio.getDatoPos(1).getanyopublicacion()){
                            Libro libroViejo=biblio.getDatoPos(i);
                            
                            System.out.println(libroViejo.getTitulo());
                        }
                        
                    }
                    break;
                case 4:
                    System.out.println(biblio.numElementos()); 
                    break;
                case 5:
                    System.out.println( biblio.toString());
                    break;
                case 0:
                    salir=true;
                    break;
                default:
                    throw new AssertionError();
            }
                    
            
        }
        
        
    }
}
