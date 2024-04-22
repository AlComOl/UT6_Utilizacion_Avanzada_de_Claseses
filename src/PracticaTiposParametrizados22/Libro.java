/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTiposParametrizados22;



/**
 *
 * @author acome
 */
public class Libro implements esComparable<Libro>{
    
    private String titulo;
    private String autor;
    private String editorial;
    private double precio;
    private int anyopublicacion;
    
    public Libro(){
        
    }
    public Libro (String t,String a,String ed,double pr, int anypubli){
        this.titulo=t;
        this.autor=a;
        this.editorial=ed;
        this.precio=pr;
        this.anyopublicacion=anypubli;
    
}
   
    @Override
    public boolean mayorQue(Libro p){
        
        return anyopublicacion> p.anyopublicacion;
    }
   
    
    public double getPrecio(){
        return this.precio;
    }
    public String getTitulo(){
        return this.titulo;
    }
     public String getAutor(){
        return this.autor;
    }
     public String getEditorial(){
         return this.editorial;
     }
     
     public int  getanyopublicacion(){
         return this.anyopublicacion;
     }
    
    @Override
    public String toString(){
        int i=0;
        return "\n Libro"+i+
           "titulo :" +this.titulo +
           "autor :" +this.autor +
           "editorial :" +this.editorial +
           "precio :" +this.precio +
           "anyo :" +this.anyopublicacion;
    }
    
    public boolean equals(Libro dato){
   
        boolean esta=false;
            if(this.titulo.equalsIgnoreCase(dato.getTitulo())){
                if(this.autor.equalsIgnoreCase(dato.getAutor()))
                    if(this.editorial.equalsIgnoreCase(dato.editorial)){
                        if(this.precio==dato.getPrecio()){
                            if(this.anyopublicacion==dato.anyopublicacion){
                                esta=true;
                            }
                        }
                    }
              
            }
            
            return esta;
                
            
        } 
}