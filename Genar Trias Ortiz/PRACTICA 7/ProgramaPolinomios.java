
public class ProgramaPolinomios {
 
	static Polinomio polinomio1;
	static Polinomio polinomio2;
	static Polinomio polinomioResultado;
	
	public static void main(String[] args) {
		int opcion=0;
		do{
			System.out.println("Elija una de las siguientes opciones: ");
			System.out.println("1.- Introducir polinomio 1:");
			System.out.println("2.- Introducir polinomio 2:");
			System.out.println("3.- Sumar polinomios:");
			System.out.println("4.- Restar polinomios: ");
			System.out.println("5.- Multiplicar polinomios: ");
			System.out.println("6.- Mostrar polinomio 1:");
			System.out.println("7.- Mostrar polinomio 2:");
			System.out.println("8.- Mostrar polinomio resultado:");
			System.out.println("9.- Salir:");
			opcion = EntradaConsola.leeEntero();
			switch(opcion){
				case 1: introducirPoli1();
					break;
				case 2: introducirPoli2();
					break;
				case 3: sumar();
					break;
				case 4: restar();
					break;
				case 5: multiplicar();
					break;
				case 6: polinomio1.visualiza();
					break;
				case 7: polinomio2.visualiza();
					break;
				case 8: polinomioResultado.visualiza();
					break;
				case 9: System.out.print("Saliendo....");
					break;
				default: System.out.print("Opcion incorrecta");
					break;
			}
		}while(opcion != 9);
		
	}
	public static void introducirPoli1(){
		System.out.println("De que grado vas a introducir el polinomio 1?: ");
		int grado = EntradaConsola.leeEntero();
		polinomio1 = new Polinomio(grado);
		polinomio1.intro();
		System.out.println("El polinomio se ha introducido correctamente.");
	}
	public static void introducirPoli2(){
		System.out.println("De que grado vas a introducir el polinomio 2?: ");
		int grado = EntradaConsola.leeEntero();
		polinomio2 = new Polinomio(grado);
		polinomio2.intro();
		System.out.println("El polinomio se ha introducido correctamente.");
	}
	public static void sumar(){
		polinomioResultado = polinomio1.suma(polinomio2);
	}
	public static void restar(){
		polinomioResultado = polinomio1.suma(polinomio2);
	}
	public static void multiplicar(){
		
	}
	
}
