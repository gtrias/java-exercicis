public class Carta{
	protected int paloNum;
	protected int numeroNum;
	protected String palo;
	protected String numero;
	protected double puntos;
		
	public Carta(int paloNum, int numeroNum){
		this.paloNum = paloNum;
		this.numeroNum = numeroNum;	
		switch(paloNum){
			case 0: this.palo = "oros";
				break;
			case 1: this.palo = "espadas";
				break;
			case 2: this.palo = "copas";
				break;
			case 3: this.palo = "bastos";
				break;
		}
		switch(numeroNum){
			case 7: this.numero = "Sota" ;
					this.puntos = 0.5;
				break;
			case 8: this.numero = "Caballo";
					this.puntos = 0.5;
				break;
			case 9:	this.numero = "Rey";
					this.puntos = 0.5;
				break;
			default: this.numero = Integer.toString(numeroNum+1);
				this.puntos = numeroNum+1;
				break;
		}
			
	}	
	
	public Carta(){
		this(1,1);
	}
	
	public void visualizarCarta(){
		System.out.println("Has sacado un: " + this.numero + " de " + this.palo);	
	}
	
	public double getPuntosCarta(){
		return (this.puntos);
	
	}
	
}