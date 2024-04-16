import java.util.*;

public class binarioEquilibrado {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String cadena;
	int cont =0, cont0=0;
//	System.out.println("Introduce el numero ");
	
	cadena=sc.next();
	
	for(int i=0;i<cadena.length();i++){
		if(cadena.charAt(i)=='1') 
			cont++;	
		else if(cadena.charAt(i)=='0')
			cont0++;	
		}
		
	if(cont==cont0) {
		if(cadena.charAt(cadena.length()-1)==cadena.charAt(1)){
			if(cadena.charAt(cadena.length()-2)==cadena.charAt(0)) {
				System.out.println("EQUILIBRADA");
			}
		}
	}else {
		System.out.println("ERROR");
	}
	}
}
