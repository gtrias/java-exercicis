public class Notas  
{
	public static void main(String[] args) 
	{
		System.out.println("PROGRAMA NOTAS");
		System.out.println("--------------");
		int susp=0;
		int aprob=0;
		int porcentaje=0;
		int continua=1;
		do{
			System.out.println("Introduce la nota");		
			int nota=EntradaConsola.leeEntero();
			if(nota<5){
				susp++;
			}else{
				aprob++;
			}
			porcentaje++;
			System.out.println("Continuar?  1=si  0=no");
			continua=EntradaConsola.leeEntero();
		}while(continua!=0);
		System.out.println("RESULTADOS DE RECOGIDA DE NOTAS");
		System.out.println("Se han tomado datos de "+porcentaje+" alumnos");
		System.out.println("Suspensos : "+(susp*100)/porcentaje+"%");
		System.out.println("Aprobados : "+(aprob*100)/porcentaje+"%");
	}
}