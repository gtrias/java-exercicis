import java.util.*;

public class Urna 
{
	
	private int bolasNegras;
	private int bolasBlancas;

	Random r = new Random();
	

	public Urna(int negras,int blancas){
		this.bolasNegras = negras;
		this.bolasBlancas = blancas;
	}
	
	public Urna(){
		this(50,50);	
	} 

	public int sacaBola(){
		
		int bola = r.nextInt(totalBolas()+1);
		
		if (identificaColor(bola) == true){
			bolasBlancas--;
		}else{
			bolasNegras--;
		}
		return(bola);
	}

	public void meteBola(int color){
		if (color == 1){
			this.bolasNegras ++;
		}else{
			this.bolasBlancas ++;
		}
	}
	
	public boolean identificaColor(int bola){
		if (bola < this.bolasBlancas){
			return(true);
		}else{
			return(false);	
		}
	}

	public boolean quedanBolas(){
		if (this.bolasNegras + this.bolasBlancas > 0){
			return(true);
		}else{
			return(false);
		}
	}
	
	public boolean quedaMasDeUnaBola(){
		if (this.totalBolas() > 1){
			return(true);
		}else{
			return(false);
		}
	}
	
	public int totalBolas(){
		return(this.bolasBlancas + this.bolasNegras);
	}
}
