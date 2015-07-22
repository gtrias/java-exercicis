
public class Cilindro extends Circulo {
	protected int lado=0;
	protected int altura=0;
	Cilindro(int r, int lado){
		this.radio = r;
		this.lado = lado;
		
	}
	public int area(){
		return(2*Mate.pi*radio*radio+lado*altura)
	}
	public int volumen(){
		return(area()*altura);
	}
	
}
