public class  Fatorial
{
	public static void main(String[] args) 
	{
		char continuar;
		do{
			int n;
			long fac=1;
			System.out.println("Introduce un numero: ");
			int n=EntradaConsola.leeEntero();
			for(int i=1;i<=n;i++)
				fac=fac*i;
			System.out.println(""+ n + "|=" + fac);
			System.out.println("Continuar? s=si     n=no");
			continuar=EntradaConsola.leeCaracter();
		}while(continuar=='s');
	}
}
