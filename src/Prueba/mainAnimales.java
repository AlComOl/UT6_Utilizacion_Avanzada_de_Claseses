package Prueba;

import Prueba.ClasesGenericas.Animal;


//
public class mainAnimales {
    public static void main(String[] args) {
        ClasesGenericas cg = new ClasesGenericas();
        
        Animal[] animales = new Animal[4];
        animales[0] = cg.new Lobo();
        animales[1] = cg.new Perro();
        animales[2] = cg.new Leon();
        animales[3] = cg.new Tigre();
        
        for(int i = 0; i < animales.length; i++) {
            animales[i].dormir();
            animales[i].comer();
        }
    }
}
