import java.util.*;
public class Baraja{

	Carta[] cartas = new Carta[40];
	
	public Baraja(){
		int pos=0;
		for(int i=0; i<4; i++){
			for(int j=0; j<10; j++){
					this.cartas[pos] = new Carta(i,j);
					pos ++;
			}	
		}
	}
	
	public Carta sacaCarta(){
		
		Random r = new Random();
		int resultado = r.nextInt(40+1);
		return(this.cartas[resultado]);
		
	}
	
	public void meteCarta(int palo, int numero){
		int pos=0;
		switch(palo){
			case 1: pos = 10+numero;
				break;
			case 2: pos = 20+numero;
				break;
			case 3: pos = 30+numero;
		}
		
		this.cartas[pos] = new Carta(palo,numero);
		
	}
	public void vaciarBaraja(){
		for(int i=0; i<40; i++){
			this.cartas[i] = null;
		}	
	}
	public boolean quedanCartas(){
		for(int i=0; i<40; i++){
			if (this.cartas[i] != null)
				return(true);	
		}
		return(false);
	}	
}