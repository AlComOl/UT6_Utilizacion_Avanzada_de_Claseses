/*******************************************************
 * @author Álvaro Comenge 
 * 
 * @fecha 2/04/2024
 * 
 * @descripcion
 * 
 * 10.Realice una clase Huevo que este compuesta por dos clases internas: 
 * Clara y Yema. Cree dos métodos hazYema() y hazClara() 
 * que generen objetos de las clases Yema y Clara respectivamente.
 * Realice un método main en el que se creen objetos de cada una de las clases.
 * 
 * 
 * 
 * ******************************************************/
public class Huevo {
	
	public class Clara{
		public String estado;
		public Clara(String estado) {
			this.estado=estado;
			//constructor por defecto
		}
		@Override
		public String toString() {
			return "Clara color :"+ estado;
		}
	}
	
	public class Yema{	
		public String estado;
		public Yema(String estado) {
			this.estado=estado;
			//constructor por defecto
		}
		@Override
		public String toString() {
			return "Color Yema:"+ estado;
		}
	}
	
	public  Clara hazClara() {
	return new Clara("Cruda");
	}
	
	public Yema hazYema() {
	return new Yema("Frita");
	}
	
	
	public static void main(String[] args) {
		Huevo h=new Huevo();
		
		Huevo.Clara blanca=h.hazClara();//Obgeto de tipo clara egg creado
			System.out.println(blanca);
//			System.out.println(blanca.toString());
		Huevo.Yema amarilla=h.hazYema();//Obgeto de tipo Yema amarilla creado 
			System.out.println(amarilla);
//			System.out.println(amarilla.toString());
		
		
		
		
		
		
	}

}
