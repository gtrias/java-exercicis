public class Mamiferos extends Animales{
	Mamiferos(String vulgar, String cientifico){
		super(vulgar,cientifico,4);
	}
	public describete(){
		super.describete();
		System.out.println("Familia: mamifero");
	}
}
