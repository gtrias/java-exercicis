package interfaz;
import java.awt.*;
import conexionBD.*;
public class VentanaClientes extends Frame{
	private TextArea taCliente;
	ConsultasCliente consulta;
	VentanaClientes(String titulo){
		super(titulo);
		taCliente = new TextArea();
		
	}
	public void mostrarCliente(int codCliente){
		 consulta = new ConsultasClinente();
		
	}

}
