public class NumeroPar 
{
	public static void main(String[] args) 
	{
		System.out.println("Introduce un numero: ");
		int n=EntradaConsola.leeEntero();
		if(n%2==0)
			System.out.println("El numero es par");
		else
			System.out.println("El numero es impar");
	}
}
