public class Animales extends SerVivo{
	protected int numPatas;
	
	public Animales(String vulgar, String cientifico, int numPatas){
			super(vulgar,cientifico);
			this.modificarPatas(numPatas);
	}
	
	public void mostrarPatas(){
		System.out.println("Numero de patas: "+ numPatas);
	}
	public void modificarPatas(int patas){
		this.numPatas = patas;			
	}
	
	public void describete(){
		super.describete();
		System.out.println("Numero de patas: "+numPatas);
		System.out.println("Nota: Puede moverse");
		
			
	}		
}