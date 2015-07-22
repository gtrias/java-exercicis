
public class PruebaLista {

	public static void main(String[] args) {
		Lista lista;
		String prueba1;
		String prueba2;
		String prueba3;
		lista = new Lista();
		prueba1 = "Esta es la prueba 1";
		prueba2 = "Esta es la prueba 2";
		prueba3 = "Esta es la prueba 3";
		
		if (lista.estaVacia() == true)
			System.out.println("La lista esta vacia");
		
		lista.ponPrimero(prueba1);
		lista.ponPrimero(prueba2);
		lista.ponPrimero(prueba3);
		lista.extraeUltimo();
		lista.extraePrimero();
		lista.ponUltimo(prueba3);
		lista.ponUltimo(prueba2);
		
	}

}
