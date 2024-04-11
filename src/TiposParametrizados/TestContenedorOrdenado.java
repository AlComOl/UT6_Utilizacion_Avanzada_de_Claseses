package TiposParametrizados;
import java.util.*;


public class TestContenedorOrdenado {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ContenedorOrdenado<Empleado> nuevoEmpleado=new ContenedorOrdenado<Empleado>();
		ContenedorOrdenado<Figura> nuevaFigura=new ContenedorOrdenado<Figura>();
		Figura f1=new Figura(5);
		Figura f2=new Figura(3);
		Figura f3=new Figura(4);
		
		Empleado e1=new Empleado(1000);
		Empleado e2=new Empleado(2000);
		Empleado e3=new Empleado(3000);
		
		
		
		
		nuevaFigura.inserta(f1);
		nuevaFigura.inserta(f2);
		
	System.out.println(nuevaFigura.toString());
		
		
		
	}

	

}
