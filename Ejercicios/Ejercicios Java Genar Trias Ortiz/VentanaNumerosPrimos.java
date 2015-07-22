import java.awt.*;
import java.awt.event.*;
class VentanaNumerosPrimos extends Frame 
{
	TextField textDesde,textHasta;
	TextArea resultado;
	Button botonCalc,botonLimpiar;
	 VentanaNumerosPrimos(String titulo){
		 super(titulo);
		 setSize(250,200);
		 setLayout(new FlowLayout());
		 botonCalc = new Button(" Calcular ");
		 botonLimpiar = new Button(" Limpiar ");
		 textDesde = new TextField(15);
		 textHasta = new TextField(15);
		 resultado = new TextArea;
		 add(new Label(" Desde: "));
		 add(textDesde);
		 add(new Label(" Hasta: "));
		 add(textHasta);
		 add(new Label(" Nº Primos: "));
		 add(resultado);	
		 add(botonCalc);
		 add(botonLimpiar);
		 
		 
	 }
			 
}
