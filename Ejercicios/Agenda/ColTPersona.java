import java.util.*;
public class ColTPersona 
{
	private Vector coleccion;
	TPersona resultado;

	ColTPersona(){
		coleccion = new Vector();
		coleccion.addElement(new TPersona("genar","arquimedes","21","605228035"));
		coleccion.addElement(new TPersona("adolfo","bajo el puente","21","605228035"));
		coleccion.addElement(new TPersona("david","el everest","21","605228035"));
		coleccion.addElement(new TPersona("rafa","World of Warcraft: nick:...","21","605228035"));
		coleccion.addElement(new TPersona("pepito","arquimedes","21","605228035"));
	}

	public void nuevaEntrada(String nombre, String direccion, String edad, String telefono){
		coleccion.addElement(new TPersona(nombre,direccion,edad,telefono));
	}
	public int tamano(){
		return(coleccion.size());
	}
	public TPersona obtenPersona(int i){
		resultado = (TPersona) coleccion.get(i);
		return(resultado);
	}
	public void borrarPersona(int i){
		coleccion.removeElementAt(i);
	}
}