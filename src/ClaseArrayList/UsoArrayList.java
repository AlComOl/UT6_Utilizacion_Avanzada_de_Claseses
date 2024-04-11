package ClaseArrayList;
//import java.io.File;
//import java.util.*;

public class UsoArrayList {

	public static void main(String[] args) {
		
		ArrayList archivos = new ArrayList(4);
		
		archivos.add("Noelia");
		archivos.add("Alvaro");
		archivos.add("Alejandro");
		archivos.add("AlvaroJR");
		/*archivos.add(new File("Gestion Pedidos"));*/
		
		String nombrepersona=(String)archivos.get(3);//se hace el casting porque el arrayList contiene obgetos de tipo archivo*/
//		en vez de agregar archivos de tipo string*/
		
		
		
	
		System.out.println(nombrepersona);
		

	}

}
