public class Cadena {
	
	protected char [] cadena;
	
	public Cadena(int n){
		this.cadena = new char[n];
	}
	public Cadena(){
		this(10);
	}
	public void lee(){
		for(int i=0; i<longitud() ; i++){
			System.out.println("Introduzca el "+i+1+" caracter");
			this.cadena[i] = EntradaConsola.leeCaracter();
		}
	}
	public void escribe(){
		for(int i=0; i<longitud(); i++){
			System.out.print(cadena[i]);
		}
	}
	public int longitud(){
		return (cadena.length) ;
	}
	public void destructor(){
		this.cadena = null;
	}
	
}
