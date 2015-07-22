class Rectangulo 
{
	protected double ancho;
	protected double largo;

	public Rectangulo(double ancho, double largo){
		this.ancho=ancho;
		this.largo=largo;
	}
	public double area(){return ancho*largo;}
	public double perimetro(){return 2*(ancho*largo)}
}
