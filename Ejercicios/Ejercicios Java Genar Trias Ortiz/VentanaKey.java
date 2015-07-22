import java.awt.*;
import java.awt.event.*;

public class VentanaKey extends Frame 
{
	TextArea ta1, ta2;
	VentanaKey(String titulo){
		super(titulo);
		setLayout(new GridLayout(2,1));
		ta1 = new TextArea(10,40);
		ta2 = new TextArea(10,40);
		ta2.setEditable(false);
		add(ta1);
		add(ta2);
		/*addWindowListener(new ControlVentana());*/
		ta1.addKeyListener(new ControlTeclado());
	}
	VentanaKey(){
		this("Ejemplo");
	}
/*	class ControlVentana implements WindowListener{
		// 7 metodos de este interfaz

	}*/
	class ControlTeclado implements KeyListener{
		public void keyPressed(KeyEvent e){
			if(e.getKeyCode() == 8)
				ta2.replaceRange("", ta1.getCaretPosition()-1, ta1.getCaretPosition());
			else
				ta2.append(""+ e.getKeyChar() );
		}
		public void keyReleased(KeyEvent e){

		}
		public void keyTyped(KeyEvent e){
			
		}

	}

}
