public class Bonoloto{
	public static void main(String arg[]){
		Bombo bombo = new Bombo(50);	
		Bombo reintegro = new Bombo(10);
		for(int i=0; i<6; i++)
			System.out.println("Ha salido el: "+ bombo.sacaBola());
		System.out.println("El complementario es: "+ bombo.sacaBola());
		System.out.println("Y el reintegro es: "+ reintegro.sacaBola());
	}	
}