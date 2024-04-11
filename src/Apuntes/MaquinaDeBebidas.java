package Apuntes;

public class MaquinaDeBebidas {
	
	private ContadorDeMonedas contador; //Contador de monedas de la maquina
	private DispensadorDeBotes cola,  limon,naranja,tonica,agua; //Cinco dispensadores de botes limon,naranja,tonica,agua;
	private float precio;//Precio de las bebidas(común para todas)
	
	/* Inicializa la maquina y todos los elementos asociados */
	/* Entradas: float m, cantidad inicial de monedas para el
	cambio */
	/* int b, cantidad inicial de botes en los dispensadores */
	/* float pvp, precio de las bebidas */
	/* Salidas: Ninguna */
	public MaquinaDeBebidas (float m, int b, float pvp) {
		this.contador = m;
	    cola =b;
	    limon = b;
	    naranja = b;
	    tonica = b;
	    agua =b;
	    precio = pvp;
	}
	/* Responder a una acción del usuario. Discrimina el tipo de
	accion */
	/* y utiliza las operaciones privadas */
	/* Entradas: char o, la orden del usuario */
	/* Salidas: Ninguna */
	public void darOrden (char o);
	/* Visualiza la informacion de interes sobre la maquina */
	/* Botes en cada dispensador, precio de las bebidas, saldo
	del cliente */
	/* Entradas: Ninguna */
	/* Salidas: Ninguna */
	public void visualizarMaquina ();
	
	/* Realiza las acciones relacionadas con la introducción de
	monedas */
	/* Entradas: char o, la orden del usuario */
	/* Salidas: Ninguna */
	private void ordenMonedas (char o);
	/* Realiza las acciones relacionadas con la selección de una
	bebida */
	/* Entradas: char o, la orden del usuario */
	/* Salidas: Ninguna */
	private void ordenSeleccion (char o);
	}

