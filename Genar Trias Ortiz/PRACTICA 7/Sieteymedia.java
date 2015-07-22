public class Sieteymedia {
	
	public static  Baraja baraja = new Baraja();
	protected static double puntosMaquina = 0;
	protected static double puntosJugador = 0;
	
	public static void main(String[] args) {
		
		boolean jugar = true;
		
		int opcion = 1;
		do {
				if (opcion == 1) {
					Carta resultado = baraja.sacaCarta();
					resultado.visualizarCarta();
					puntosJugador = puntosJugador + resultado.getPuntosCarta();
					System.out.println("Tienes un total de: " + puntosJugador + "Puntos");
					System.out.println("Que deseas hacer?:");
					System.out.println("1.- Cojer carta");
					System.out.println("2.- Plantarse: ");
					opcion = EntradaConsola.leeEntero();
					if (puntosJugador > 7.5){
						System.out.println("Lo siento no puedes seguir jugando has pasado de 7.5");
						opcion=2;
					}
					tiraMaquina();
				}
				if(opcion ==2 && tiraMaquina() == true)
					jugar = false;			
		} while (jugar == true);
		
		if(jugadorHaGanado() == true){
			System.out.println("Felcidades has gando!!!");
			System.out.println("Puntos jugador: " + puntosJugador);
			System.out.println("Puntos maquina: " + puntosMaquina);
		}else{
			System.out.println("Ooooh que lastima parece que has perdido....");
			System.out.println("Puntos jugador: " + puntosJugador);
			System.out.println("Puntos maquina: " + puntosMaquina);
		}
	}
	
	

	public static boolean jugadorHaGanado() {
		if (puntosJugador < 7.5 && puntosJugador > puntosMaquina) 
			return (true);
		return (false);
	}
	
	public static boolean tiraMaquina(){   // Retorna true si la maquina se planta
		if (puntosMaquina >= 7.0)
			return(true);
		Carta resultado = baraja.sacaCarta();
		puntosMaquina = puntosMaquina + resultado.getPuntosCarta();
		return(false);	
	}
}