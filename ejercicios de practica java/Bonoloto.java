public class Bonoloto 
{
	public static void main(String[] args) 
	{
		System.out.println("BONOLOTO");
		System.out.println("--------");
		System.out.println("--------");
		char continuar='s';
		do{
			for(int i=1;i<=5;i++){
				int n=(int) (Math.random()*10);
				System.out.println(""+n+"");
			}
			System.out.println("Seguir jugando? s=si  n=no");
			continuar=EntradaConsola.leeCaracter();
		}while(continuar=='s');
	}
}
