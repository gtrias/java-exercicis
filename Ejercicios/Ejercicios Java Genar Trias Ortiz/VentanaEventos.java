import java.awt.*;
import java.awt.event.*;
public class VentanaEventos extends Frame 
{
	public TextArea ta;

	  VentanaEventos(String titulo){
		super(titulo);
		ta = new TextArea(10,40);
		ta.setEditable(false);
		ta.setBackground(new Color(0,245,0));
		ta.setForeground(new Color(255,0,0));
		add(ta);
		setSize(500,500);
 		this.addWindowListener(new ControlVentana());
	 }

	public VentanaEventos(){
		this("");
	}
	class ControlVentana extends WindowAdapter {
 		public void windowActivated(WindowEvent e) {
			ta.append("Ventana activada");
		}
		public void windowClosed(WindowEvent e) {
			ta.append("Ventana cerrada");
		}
		//public void windowClosing(WindowEvent e) {System.exit(0);}
		public void windowDeactivated(WindowEvent e) {
			ta.append("Ventana desactivada");
		}
		public void windowDeiconified(WindowEvent e) {
			ta.append("Ventana restaurada");
		}
		public void windowIconified(WindowEvent e) {
			ta.append("Ventana minimizada");
		}
		public void windowOpened(WindowEvent e) {
			ta.append("Ventana abierta");
		}
	}

}


