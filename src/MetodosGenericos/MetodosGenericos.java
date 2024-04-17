package MetodosGenericos;

public class MetodosGenericos {

	public static void main(String[] args) {
		
		String nombres []= {"Jose","Maria","Pepe"};
		
		
		
		System.out.println(MisMatrices.getMenor(nombres));
		
		
	}
public class MisMatrices{
	
	/*public static <T> String getElementos(T[]a){
		
		return "El array tiene " + a.length+" elementos";
	}*/
	
	public static <T extends Comparable> T getMenor(T[]a) {
		if(a==null || a.length==0) {
			
			return null;
		}
		
		T elementoMenor=a[0];
		
		for(int i=1;i<a.length;i++) {
			
			if(elementoMenor.compareTo(a[i])>0) {
				elementoMenor=a[i];
			}
		}
		
		return elementoMenor;
			}
		}
	
	
}

