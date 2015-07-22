public class  NumeroNatural
{
	public static void main(String[] args) 
	{
		System.out.println("Desde numero:");
		int desde=EntradaConsola.leeEntero();
		System.out.println("Hasta numero:");
		int hasta=EntradaConsola.leeEntero();
		for(int i=desde; i<=hasta; i++)
				System.out.println("" + i);
	}
}
