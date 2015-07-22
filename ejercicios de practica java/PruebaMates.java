public class  PruebaMates
{
	public static void main(String[] args) 
	{
		System.out.println("Introduce un numero: ");
		int n=EntradaConsola.leeEntero();
		System.out.println("Introduce un numero: ");
		int m=EntradaConsola.leeEntero();
		int x=Mates.amigos(n,m);
		if (x==1)System.out.println("Son amigos");
		else System.out.println("No son amigos");
		x=Mates.primos(n,m);
		if (x==1)System.out.println("Son primos entre si");
		else System.out.println("No son primos entre si");
		x=Mates.combinatorio(n,m);
		System.out.println("Resultado de combinatorio: "+x+"");
		x=Mates.potencia(n,m);
		System.out.println("Resultado de potencia: "+x+"");
		System.out.println("Introduce un numero");
		int a=EntradaConsola.leeEntero();
		x=Mates.euler(a);
		System.out.println("Resultado Euler: "+x+"");
		x=Mates.perfecto(a);
		if (x==1)System.out.println("Perfecto");
		else System.out.println("No perfecto");
		x=Mates.primo(a);
		if (x==0)System.out.println("No es primo");
		else System.out.println("Es primo");
		float z=Mates.factorial(a);
		System.out.println("Factorial : "+z+"");
	}
}
