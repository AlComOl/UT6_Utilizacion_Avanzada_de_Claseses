package PRG_6_TiposParametrizados;
public class Prueba {

	public static void main(String[] args) {
		boolean continuar = true;
		int dato;
		ContenedorInteger miContenedor = new ContenedorInteger();
		
		int pos;
		while (continuar) {
			int opcion = Utils.mostrarMenu("Menu", "Anyadir dato", "Eliminar dato", "Obtener dato en posicion n",
					"Buscar dato en el contenedor", "Num datos del contenedor", "Mostrar contenedor", "Salir");
			switch (opcion) {
			case 1: /* Anyadir dato */
				dato = Utils.preguntarInt("Dato a anyadir", 1, Integer.MAX_VALUE);
				miContenedor.anyadeDatoOrdenado(dato);
				break;

			case 2:
				dato = Utils.preguntarInt("Elemento a eliminar", 1, Integer.MAX_VALUE);
				miContenedor.eliminarDato(dato);
				break;

			case 3: // Obtener dato en posicion n
				pos = Utils.preguntarInt("Introduce posicion", 1, Integer.MAX_VALUE);
				dato = miContenedor.obtenerDatoPos(pos);
				System.out.println("En la posicion " + pos + " dato" + dato);
				break;
			case 4:
				dato = Utils.preguntarInt("Elemento a buscar", 1, Integer.MAX_VALUE);
				boolean ok = miContenedor.buscarDato(dato);
				if (ok)
					System.out.println("Elemento " + dato + " esta en el contenedor");
				else
					System.out.println("Elemento " + dato + " no esta en el contenedor");
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
