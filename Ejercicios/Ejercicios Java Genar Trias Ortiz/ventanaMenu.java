import java.awt.*;
import java.awt.event.*;
class VentanaMenu extends Frame{
	 VentanaMenu(){
			MenuBar mb = new MenuBar();
			Menu entrada1 = new Menu("Entrada1");
			Menu entrada2 = new Menu("Entrada2");
			Menu ayuda = new Menu("Ayuda");
			
			MenuItem subEntrada11 = new MenuItem("SubEntrada 1 1");
			MenuItem subEntrada12 = new MenuItem("SubEntrada 1 2", new MenuShortcut(KeyEvent.VK_E));
			Menu subEntrada13 = new Menu("SubEntrada 1 3");
			MenuItem subEntrada131 = new MenuItem("SubEntrada 1 3 1");
			MenuItem subEntrada132 = new MenuItem("SubEntrada 1 3 2");
			


			

			mb.add(entrada1);
			mb.add(entrada2);
			mb.addSeparator();
			mb.add(ayuda);

			entrada1.add(subEntrada11);
			entrada1.insertSeparator(1);
			entrada1.add(subEntrada12);
			entrada1.add(subEntrada13);
			subEntrada13.add(subEntrada131);
			subEntrada13.add(subEntrada132);

			this.setMenuBar(mb);
	 }

}
