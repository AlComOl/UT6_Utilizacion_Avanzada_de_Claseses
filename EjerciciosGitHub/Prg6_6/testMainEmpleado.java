package Prg6_6;

/************************************************************************************
 * @Autor: Álvaro Comenge 
 * 
 * @fecha:23/03/24
 * 
 * @descripcion:
 * Cree una clase Empleado y una subclase Encargado. Los encargados reciben un 10% más 
 * de sueldo base que un empleado normal. Implemente dichas clases en un paquete sobrescribe y
 * sobrescriba el método getSueldo() para ambas clases. Las variable miembro no pueden ser accesibles
 * desde el exterior.
 * ***********************************************************************************/

public class testMainEmpleado {

	public static void main(String[] args) {
		
		Empleado emple=new Empleado("Jose",1050);
		
			
		
		Encargado encar=new Encargado("Pepe",1000);
		
		
		
		System.out.println(emple.getSueldo());
		System.out.println(encar.getSueldo());
		
		System.out.println(emple.toString());
		System.out.println(encar.toString());

	}

}
