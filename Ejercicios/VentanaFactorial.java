import java.awt.*;
import java.awt.event.*;
class VentanaFactorial extends Frame 
{
	TextField textNumero,textResultado;
	Button botonCalc,botonLimpiar;
	 VentanaFactorial(String titulo){
		 super(titulo);
		 setSize(230,150);
		 setLayout(new FlowLayout());
		 botonCalc = new Button(" Calcular ");
		 botonLimpiar = new Button(" Limpiar ");
		 textNumero = new TextField(15);
		  
		 textResultado = new TextField(15);
		  
		 add(new Label(" Numero: "));
		 add(textNumero);
		 add(new Label(" Resultado: "));
		 add(textResultado);
		 add(botonCalc);
		 add(botonLimpiar);
		 
		 
	 }
			 
}
