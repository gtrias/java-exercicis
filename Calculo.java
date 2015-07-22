class Calculo 
{
	public static void main(String[] args) 
	{
		System.out.println("Introduzca el radio del circulo: ");
		double r = EntradaConsola.LeeReal();
		Circulo circulo = new Circulo(r);
		System.out.println("area = " + circulo.area());
		System.out.println("circunferencia = " + circulo.circunferencia());

	}
}
