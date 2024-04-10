package ClaseArrayList;
import java.io.File;
import java.util.*;

public class UsoArrayList {

	public static void main(String[] args) {
		
		ArrayList archivos = new ArrayList(4);
		
		/*archivos.add("Noelia");
		archivos.add("Alvaro");
		archivos.add("Alejandro");
		archivos.add("AlvaroJr");
		
		String nombrepersona=(String)archivos.get(1);//se hace el casting porque el arrayList contiene obgetos de tipo archivo*/
//		en vez de agregar archivos de tipo string
		
		archivos.add(new File("gestionPedidos.fre"));
		
		File nombrepersona=(File)archivos.get(0);
		System.out.println(nombrepersona);
		

	}

}
