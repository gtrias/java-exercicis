public class SerVivo{
	protected String nomCientifico;
	protected String nomVulgar;
	 
	SerVivo(String vulgar, String cientifico){
		this.setNomVulgar(vulgar);
		this.setNomCientifico(cientifico);
	}
	SerVivo(){
		this("intro nombre","intro nombre")	
	}
	
	
	public void setNomVulgar(String nombre){
		this.nomVulgar = nombre;
	}
	
	public void setNomCientifico(String nombre){
		this.nomCientifico = nombre;
	}
	
	public void describete(){
		System.out.println("Nombre Cientifico: "+  nomCientifico);
		System.out.println("Nombre Vulgar: "+  nomVulgar); 
	}	
	
}