package TiposParametrizados;
import java.util.*;
/*************************
 * @autor Álvaro Comenge 
 * 
 * @fecha 13/03/2024
 * 
 * Clase main
 *************************/

public class TestContenedorOrdenado {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//Cada una de estas instancias está parametrizada con un tipo específico: Empleado y Figura, respectivamente
		ContenedorOrdenado<Empleado> nuevoEmpleado=new ContenedorOrdenado<Empleado>();
		ContenedorOrdenado<Figura> nuevaFigura=new ContenedorOrdenado<Figura>();
		
		Figura f1=new Figura(5);
		Figura f2=new Figura(3);
		Figura f3=new Figura(4);
		nuevaFigura.inserta(new Figura(6));// esto es como hacerlo en un paso , pero el obgeto no tiene nombre
		
		Empleado e1=new Empleado(3000);
		Empleado e2=new Empleado(2000);
		Empleado e3=new Empleado(1000);
		
		
		
		
		nuevaFigura.inserta(f1);
		nuevaFigura.inserta(f2);
		nuevaFigura.inserta(f3);
		
		nuevoEmpleado.inserta(e1);
		nuevoEmpleado.inserta(e2);
		nuevoEmpleado.inserta(e3);
		
		
		
		
		
	
		
	System.out.println(nuevaFigura.toString());
	System.out.println("**********************************************");
	System.out.println(nuevoEmpleado.toString());
		
		
		
	}

	

}
