import java.awt.*;
import java.awt.event.*;
class VentanaEscribeCont extends Dialog 
{
	TextField login,pass;
	 VentanaEscribeCont(Frame fr, String titulo){
		super(fr,titulo);
		setLayout(new GridLayout(2,2));
		setSize(300,100);
		addWindowListener(new EventoVentana());
		add(new Label("Usuario: "));
		login = new TextField();
		add(login);
		add(new Label("Password: "));
		pass = new TextField();
		add(pass);
	 }
	 class EventoVentana extends WindowAdapter
	{
		public void windowClosing(WindowEvent we) { setVisible(false); }
	}
}
