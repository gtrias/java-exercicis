public class Vegetales extends SerVivo{

	protected String [] partes;
	
	Vegetales(String vulgar, String cientifico, int numPartes){
		super.setNomVulgar(vulgar);
		super.setNomCientifico(cientifico);
		partes = new String [numPartes]
	}
	public void modificarPartes(){
		for(int i=0; i< partes.lenght; i++){
			System.out.println("Introduzca la descripcion de la parte num "+i+": ");
			partes[i] = EntradaConsola.leeCadena();
		}
	}
	
	public void describete(){
		super.describete();
		System.out.println("Nota: No puede moverse");
			
	}	
}