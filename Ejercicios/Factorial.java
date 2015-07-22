class Factorial 
{
	public int calcular(int numero){
		int resultado,i;
		resultado = numero;
		for (i=1; i < numero; i++){
			resultado = resultado * i;
		}
		return(resultado);
	}
	
}
