public class Circulo 
{
	protected double radio;
	public Circulo(double radio){
		this.radio = radio;
	}
	public Circulo(){
		this(1.0);
	}
	public double area(){
		return(Mate.pi * radio * radio);
	}
	public double circunferencia(){
		return(2 * Mate.pi * radio);
	}
}
