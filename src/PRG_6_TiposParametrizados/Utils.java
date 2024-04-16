package PRG_6_TiposParametrizados;
import java.util.*;

public class Utils {
	/**
	 * Muestra un texto y espera una entrada del teclado
	 * @return Valor introducido por teclado
	 */
	public static String preguntarString(String pregunta) {
		System.out.print(pregunta+": ");
		Scanner entrada = new Scanner(System.in);
		
		return entrada.next();
	}

	/**
	 * Muestra un texto y espera un número entre min y max por el teclado
	 * @return Número introducido
	 */
	public static int preguntarInt(String pregunta, int min, int max) {
		boolean repetir = true;
		int resultado = -1;
		do {
			String valor = Utils.preguntarString(pregunta);
			try {
				resultado = Integer.parseInt(valor);
				repetir = (resultado < min) || (resultado > max);
				if (repetir) {
					System.out.println("Error: "+resultado+" fuera de rango");
				}
			} catch(NumberFormatException e) {
				System.out.println("Error: "+valor+" no es un número válido");
			}
		} while (repetir);
		
		return resultado;
	}

	/**
	 * Muestra un texto y espera un número double por el teclado
	 * @return Número introducido
	 */
	public static double preguntarDouble(String pregunta, double min, double max) {
		boolean repetir = true;
		double resultado = -1;
		do {
			String valor = Utils.preguntarString(pregunta);
			try {
				resultado = Double.parseDouble(valor);
				repetir = (resultado < min) || (resultado > max);
				if (repetir) {
					System.out.println("Error: "+resultado+" fuera de rango");
				}
			} catch(NumberFormatException e) {
				System.out.println("Error: "+valor+" no es un n�mero v�lido");
			}
		} while (repetir);
		
		return resultado;
	}
	
	/**
	 * Muestra un texto y espera un número de entre un listado de opciones
	 * @param pregunta Texto a mostrar
	 * @param validos  Resultados posibles (lista de parámetros o array)
	 * @return Número introducido
	 */
	public static int preguntarInt(String pregunta, int... validos) {
		boolean preguntar = true;
		int resultado;
		do {
			resultado = Utils.preguntarInt(pregunta, validos[0], validos[validos.length - 1]);
			preguntar = Arrays.binarySearch(validos, resultado) < 0;
		} while(preguntar);
		
		return resultado;
	}
	
	/**
	 * Muestra menú y espera que el usuario elija una opción
	 * @param titulo   Título del menú
	 * @param opciones Opciones del menú (lista de parámetros o array)
	 *                 (una opción vacía añade una línea en blanco)
	 * @return Opción escogida
	 */
	public static int mostrarMenu(String titulo, String... opciones) {
		System.out.println();
		System.out.println(titulo);
		System.out.println("====");
		int resultado;
		if ((opciones == null) || (opciones.length == 0)) {
			resultado = -1;
		} else {
			int numOpciones = 0;
			for(int i=0; i<opciones.length; i++) {
				if ((opciones[i] == null) || ("".equals(opciones[i].trim()))) {
					System.out.println();
				} else {
					numOpciones++;
					System.out.println("  "+numOpciones+". "+opciones[i]);
				}
			}
			System.out.println();
			resultado = Utils.preguntarInt("    Elige opci�n", 1, numOpciones);
			System.out.println();
		}
		
		return resultado;
	}
}
