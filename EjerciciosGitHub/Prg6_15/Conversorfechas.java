package Prg6_15;

public class Conversorfechas {
	
	/****************
	 * dividimos la cadena por el / en 3 partes
	 * invertimos las 2 primeras posiciones
	 * 
	 * @param cadena
	 * @return fecha modificada
	 ****************/
	public String normalToAmericano(String cadena) {
		
		String dma[]=cadena.split("/");
		
		return dma[1]+"/"+dma[0]+"/"+dma[2];
		
	}
	/****************
	 * dividimos la cadena por el / en 3 partes
	 * invertimos las 2 primeras posiciones
	 * 
	 * @param cadena
	 * @return fecha modificada
	 ****************/
	public String AmericanoToNormal(String cadena) {
			
			String dma[]=cadena.split("/");
			
			return dma[1]+"/"+dma[0]+"/"+dma[2];
			
		}

	

}
