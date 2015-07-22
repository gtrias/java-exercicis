public class   Primo
{
	public static void main(String[] args) 
	{
		int i;
		int n;	
		int aux;
		char continua='s';
		do{
			aux=0;
			System.out.println("Introduce un numero");
			n=EntradaConsola.leeEntero();
			for(i=1;i<n+1;i++){
				if(n%i==0)aux++;
			}
			if(aux==2)System.out.println("El numero "+ n +" es primo");
			else{
				System.out.println("El numero "+ n +" no es primo");
			}
			System.out.println("Repetir? s=si  n=no");
			continua=EntradaConsola.leeCaracter();
		}while(continua=='s');
	}
}