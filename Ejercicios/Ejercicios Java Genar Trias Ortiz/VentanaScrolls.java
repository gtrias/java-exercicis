import java.awt.*;
import java.awt.event.*;

class  VentanaScrolls extends Frame
{
	Panel etiquetas;
	Panel colores;
	Panel scrolls;
	Scrollbar scroll1,scroll2,scroll3;
	Label lRojo,lAzul,lVerde;
	VentanaScrolls(String titulo){
		super(titulo);
		addWindowListener(new VentanaListener());
		setSize(600,400);
		setLayout(new GridLayout(3,1));
		etiquetas = new Panel();
		etiquetas.setLayout(new GridLayout(1,3));
		lRojo = new Label(" Rojo: 0");
		lAzul = new Label(" Azul: 0");
		lVerde = new Label(" Verde: 0");
		etiquetas.add(lRojo);
		etiquetas.add(lAzul);
		etiquetas.add(lVerde);
		colores = new Panel();
		scrolls = new Panel();
		scrolls.setLayout(new GridLayout(3,1));
		scroll1 = new Scrollbar(0, 0, 0, 0, 255);
		scroll2 = new Scrollbar(0, 0, 0, 0, 255);
		scroll3 = new Scrollbar(0, 0, 0, 0, 255);
		scroll1.addAdjustmentListener(new ScrollListen());
		scroll2.addAdjustmentListener(new ScrollListen());
		scroll3.addAdjustmentListener(new ScrollListen());
		scrolls.add(scroll1);
		scrolls.add(scroll2);
		scrolls.add(scroll3);
		
		 add(colores);
		 add(scrolls);
		
	}
	VentanaScrolls(){
		this("ventana");
	}
	class ScrollListen implements AdjustmentListener
	{
		public void adjustmentValueChanged(AdjustmentEvent e) {
			int rojo=scroll1.getValue(),azul=scroll2.getValue(),verde=scroll3.getValue();
			if(e.getSource() == scroll1){
				azul = e.getValue();
				colores.setBackground(new Color(rojo,verde,azul));
			}
			if(e.getSource() == scroll2){
				rojo = e.getValue();
				colores.setBackground(new Color(rojo,verde,azul));
			}
			if(e.getSource() == scroll3){
				verde = e.getValue();
				colores.setBackground(new Color(rojo,verde,azul));
			}
		}
	}
	class VentanaListener extends WindowAdapter
	{
		public void windowClosing(WindowEvent we) { System.exit(0); }
	}
}
