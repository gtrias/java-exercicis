public class Sieteymedio{
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		Baraja baraja = new Baraja();
		double puntosMaquina=0, puntosJugador=0;
		char opc;
		do{
			Carta carta = baraja.sacaCarta();
			carta.visualizarCarta();
			puntosJugador = puntosJugador + carta.puntos;
			
			
			
			System.out.println("Quieres continuar?(s/n) :");
			opc = EntradaConsola.leeCaracter();
			
		}while(opc=='s');

		
	}
}