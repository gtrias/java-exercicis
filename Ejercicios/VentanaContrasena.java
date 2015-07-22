import java.awt.*;
import java.awt.event.*;

class  VentanaContrasena extends Frame
{
	Button boton;
	VentanaEscribeCont ventanaPass;
	VentanaContrasena(String titulo){
		super(titulo);
		ventanaPass = new VentanaEscribeCont(this,"Ventana password");
		setLayout(new FlowLayout());
		setSize(150,75);
		boton = new Button("Pulse aqui");
		boton.addActionListener(new BotonControl());
		addWindowListener(new EventoVentana());
		add(boton);
	}
	class BotonControl implements ActionListener  {
        public void actionPerformed(ActionEvent e) {
			ventanaPass.setVisible(true);
		}
   }
	class EventoVentana extends WindowAdapter
	{
		public void windowClosing(WindowEvent we) { System.exit(0); }
	}
	
}
