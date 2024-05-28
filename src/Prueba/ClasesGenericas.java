package Prueba;
//Mediante el polimorfismo se puede asignar a una referencia de un tipo superior en la jerarquía de
//herencia, una instancia de un tipo inferior (que herede).
//Que la referencia sea de otro tipo no significa que los métodos que se ejecuten sean otro tipo.
//Siguen siendo los de la instancia.

//Polimorfismo de clases genericas
public class ClasesGenericas {
	
	public class Animal{
		public void dormir() {
			System.out.println("duermo");
			
		}
		public void comer() {
			System.out.println("como");
		}
	}
	public  class Lobo extends Animal{
		
	}
	public  class Perro extends Animal{
		
	}
	public  class Leon extends Animal{
		
	}
	public  class Tigre extends Animal{
		
	}
	

	

}
