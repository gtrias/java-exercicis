public class Polinomio {

	int [] contenido;
	
	Polinomio(int n){
		contenido = new int[n+1];
	}
	
	Polinomio(){
		this(3);
	}
	
	public void destructor(){
		contenido = null;
	}
	
	public void intro(){
		for(int i=0;i<longitud();i++){
			 System.out.println("Introduzca el valor del exponente" +i);
			 contenido[i] = EntradaConsola.leeEntero();
		}
	}
	
	public int longitud(){
		return(contenido.length);
	}
	
	public void visualiza(){
		for(int i=longitud()-1; i>=0 ;i--){
			System.out.print(contenido[i]+"x"+i+" ");
		}
	}
	
	public Polinomio suma(Polinomio s){
		Polinomio result;
		if(contenido.length > s.contenido.length){
			result = new Polinomio(contenido.length);
			for(int i=0; i<s.contenido.length; i++){
				result.contenido[i] = result.contenido[i] + s.contenido[i];
			}
		}else{
			result = new Polinomio(s.contenido.length);
			for(int i=0; i<contenido.length;i++){
				result.contenido[i] = result.contenido[i] + contenido[i];
			}
		}
		return(result);
	}
	
	public Polinomio resta(Polinomio r){
		Polinomio result;
		if(contenido.length > r.contenido.length){
			result = new Polinomio(contenido.length);
			for(int i=0; i<r.contenido.length; i++){
				result.contenido[i] = result.contenido[i] - r.contenido[i];
			}
		}else{
			result = new Polinomio(r.contenido.length);
			for(int i=0; i<contenido.length;i++){
				result.contenido[i] = result.contenido[i] - contenido[i];
			}
		}
		return(result);
	}
	
	public Polinomio multiplica(Polinomio m){
		Polinomio result;
		result = new Polinomio(2);
		return(result);
	}
}
