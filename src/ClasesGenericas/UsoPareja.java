package ClasesGenericas;

public class UsoPareja {

	public static void main(String[] args) {
		
		Pareja <String> uno=new Pareja<String>();
		
		uno.setPrimero("Juan");
		
		System.out.println(uno.getPrimero());
		
		Persona  pers=new Persona("Ana");
		
		Pareja <Persona> otra=new Pareja <Persona>();
		
		otra.setPrimero(pers);
		
		
		System.out.println(pers);

		
		

	}
	
	
		
		
	}
	class Persona{
	
		private String nombre;
		
		public Persona() {
			
		}
		
		public Persona(String n) {
			
			this.nombre=n;
		}
		
		
		@Override
		public String toString() {
			
			return nombre;
		}
}
