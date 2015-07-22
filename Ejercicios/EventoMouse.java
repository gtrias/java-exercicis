import java.awt.*;
import java.awt.event.*;
public class EventoMouse extends Frame
{
	TextArea ta;
	EventoMouse(String titulo){
		super(titulo);
		setLayout(new GridLayout(2,1));
		Panel p = new Panel();
		p.setBackground(new Color(0,255,0));
		p.addMouseListener(new ControlRaton());
		p.addMouseMotionListener(new ControlRaton());
		add(p);
		ta = new TextArea(10,40);
		ta.setEditable(false);
		add(ta);
		addWindowListener(new ControlVentana());
	}
	EventoMouse() {
		this("");
	}
	public class ControlVentana
	{
		public void windowActivated(WindowEvent e) {;}
		public void windowClosed(WindowEvent e) {;}
		public void windowClosing(WindowEvent e) {System.exit(0);}
		public void windowDeactivated(WindowEvent e) {;}
		public void windowDeiconified(WindowEvent e) {;}
		public void windowIconified(WindowEvent e) {;}
		public void windowOpened(WindowEvent e) {;}
	}
	public class ControlRaton implements MouseListener
	{
		public void mouseClicked(MouseEvent e){
			if(e.getButton==MouseEvent.BUTTON1)
				ta.append("Boton izquierdo clickado");
			if(e.getButton==MouseEvent.BUTTON2)
				ta.append("Button del medio clickado");
			else
				ta.append("Boton derecho clickado");
		}
		public void mousePressed(MouseEvent e){
			ta.append("Boton presionado");
		}
		public void mouseEntered(MouseEvent e){
			ta.append("Entrando en zona de control");
		}
		public void mouseExited(MouseEvent e){
			ta.append("Saliendo de zona de control");
		}
		public void mouseMoved(MouseEvent e){
			ta.append("x="+ e.getX);
			ta.append(" y="+ e.getY);
		}


	}


}
