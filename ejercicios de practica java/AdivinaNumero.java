public class AdivinaNumero 
{
	public static void main(String[] args) 
	{
		System.out.println("Numero a adivinar: ");
		int n=EntradaConsola.leeEntero();
		int creditos=5;
		int m;
		do{
			System.out.println("Numero: ");
			m=EntradaConsola.leeEntero();
			if(m==n)System.out.println("Numero adivinado ");
			else{
				creditos--;
				System.out.println("Numero equivocado.Te quedan "+ creditos + "oportunidades");
			}
		}while(m!=n || creditos!=0);
	}
}
