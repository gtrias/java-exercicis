public class ProgramaUrna 
{
	
	public static void main(String[] args){
			int resultado;
			
			Urna urna = new Urna(50,50);
			
			while (urna.quedaMasDeUnaBola() == true)
			{
				int bola1,bola2;
				bola1 = urna.sacaBola();
				bola2 = urna.sacaBola();
				if (urna.identificaColor(bola1) == urna.identificaColor(bola2))
				{
					urna.meteBola(1);
				}else{
					urna.meteBola(0);
				}
			}
			resultado = urna.sacaBola();
			 
			if (urna.identificaColor(resultado) == true)
			{
				System.out.println("La ultima bola es blanca!!");	
			}else{
				System.out.println("La ultima bola es negra!!");
			}

	}
}
