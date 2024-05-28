package PRG_6_TiposParametrizados_Version_Genericos;

public class Prueba {

	public static void main(String[] args) {
		boolean continuar = true;
		int edad;
		String nombre;
		Policias p;
		
		ContenedorOrdenado<Policias>miContenedor = new ContenedorOrdenado<Policias>();
	
		int pos;
		while (continuar) {
			int opcion = Utils.mostrarMenu("Menu", "Anyadir dato", "Eliminar dato", "Obtener dato en posicion n",
					"Buscar dato en el contenedor", "Num datos del contenedor", "Mostrar contenedor", "Salir");
			switch (opcion) {
			case 1: /* Anyadir dato */
				edad = Utils.preguntarInt("Dame la edad", 1, Integer.MAX_VALUE);
				nombre=Utils.preguntarString("Dame la nombre");
				
				p=new Policias(nombre,edad);
				
				miContenedor.anyadeDatoOrdenado(p);
				break;

			case 2:
				pos = Utils.preguntarInt("Posicion a eliminar", 1, Integer.MAX_VALUE);
				miContenedor.eliminarDato(pos);
				break;

			case 3: // Obtener dato en posicion n
				pos = Utils.preguntarInt("Introduce posicion", 1, Integer.MAX_VALUE);
				p = miContenedor.getDatoPos(pos);
				System.out.println("En la posicion " + pos + " dato" + p.toString());
				break;
			case 4:
				edad = Utils.preguntarInt("Dame la edad", 1, Integer.MAX_VALUE);
				nombre=Utils.preguntarString("Dame la nombre");
				
				p=new Policias(nombre,edad);
				
				boolean ok = miContenedor.buscarDato(p);
				if (ok)
					System.out.println("Elemento " + p.toString() + " esta en el contenedor");
				else
					System.out.println("Elemento " + p.toString() + " no esta en el contenedor");
				break;

			case 5:
				System.out.println("En el contenedor hay " + miContenedor.numElementos() + " datos");
				break;

			case 6:
				System.out.println("Elementos en el contenedor");
				System.out.println(miContenedor);
				break;
			case 7:
				continuar = false;
			}

		}

	}
}
