import java.awt.*;
import java.awt.event.*;

class MenuEmergente extends Frame 
{
	PopupMenu popup;
	Panel p;
	MenuEmergente(String titluo){
		super(titulo);
		p = new Panel();
		add(p);
		popup = new PopupMenu();
		MenuItem m1, m2, m3, m4, m41, m42;
		m1 = new MenuItem(" Copiar ");
		m2 = new MenuItem(" Cortar ");
		m3 = new MenuItem(" Pegar ");
		popup.add(m1);
		popup.add(m2);
		popup.add(m3);
		popup.addSeparator();
		m4 = new MenuItem(" Menu ");
		m41 = new MenuItem(" Submenu 1  ");
		m42 = new MenuItem("  Submenu 2 ");
		m4.add(m41);
		m4.add(m42);
		popup.add(m4);
		p.add(popup);
		add(p);
		addWindowListener(new ControlVentana());
		p.addMouseListener(new ControlRaton());
	}
	public MenuEmergente() {this("");}
	class ControlVentana extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	}
	class ControlRaton extends MouseAdapter
	{
		public void MouseClicked(MouseEvent e){
			if(e.getButton()==MouseEvent.BUTTON3){
				popup.show(p,e.getX(),e.getY());
			}
		}
	}
	 
}
