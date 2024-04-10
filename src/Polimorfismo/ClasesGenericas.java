package Polimorfismo;
//Mediante el polimorfismo se puede asignar a una referencia de un tipo superior en la jerarquía de
//herencia, una instancia de un tipo inferior (que herede).
//Que la referencia sea de otro tipo no significa que los métodos que se ejecuten sean otro tipo.
//Siguen siendo los de la instancia.

//Polimorfismo de clases genericas
public class ClasesGenericas {
	
	public class Animal{
		public void dormir() {
			
		}
		public void comer() {
			
		}
	}
	public class Lobo extends Animal{
		
	}
	public class Perro extends Animal{
		
	}
	public class Leon extends Animal{
		
	}
	public class Tigre extends Animal{
		
	}
	

	public static void main(String[] args) {
		Animal[] animales = new Animal[4];
		animales[0] = new Lobo();
		animales[1] = new Perro();
		animales[2] = new Leon();
		animales[3] = new Tigre();
		for(int i=0; i<animales.length; i++) {
		animales[i].dormir();
		animales[i].comer();
		}

	}

}
