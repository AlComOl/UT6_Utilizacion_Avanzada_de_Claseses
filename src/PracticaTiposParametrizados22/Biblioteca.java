/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTiposParametrizados22;

/**
 *
 * @author acome
 */
public class Biblioteca {
    
    
    
    private String nombre;
    
    private ContenedorOrdenado<Libro> libros;
    
    public Biblioteca(){
        
        libros=new ContenedorOrdenado<Libro>();
        
    }
    
    public Biblioteca(String nombre){
        this.nombre=nombre;
        libros=new ContenedorOrdenado<Libro>();
        
    }
    
   public Libro masantiguo() {
        return libros.getDatoPos(0);
	}
    
}
