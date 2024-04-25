package PracticaExamen240224;

public class GafasRV extends Dispositivo {
	
	

	private double version;
	private int capacidad;
	
	public GafasRV() {
		
	}
	
	public GafasRV(double v, int capacidad) {
		this.version=v;
		this.capacidad=capacidad;
	}

	
	@Override
	public String toString() {
		return "GafasRV [version=" + version + ", capacidad=" + capacidad + "]";
	}
}
