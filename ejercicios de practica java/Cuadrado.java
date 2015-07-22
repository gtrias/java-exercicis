public class  Cuadrado
{
	public static void main(String[] args) 
	{
		System.out.println("CUADRADO");
		System.out.println("Largo: ");
		int largo=EntradaConsola.leeEntero();
		System.out.println("Alto: ");
		int alto=EntradaConsola.leeEntero();
		int cont=0;
		do{
			for(int i=0;i<largo+1;i++){
				System.out.print("*");
			}
			System.out.println("");
			cont++;
		}while(cont<alto);
	}
}
