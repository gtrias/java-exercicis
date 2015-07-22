import java.awt.*;
import java.awt.event.*;

class GuiScrollPane extends Frame{
	GuiScrollPane(){
		Panel panel = new Panel();
		ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
		panel.setLayout(new GridLayout(5,2));
		for(int i=0; i<10; i++)
			panel.add(new Button("Boton" + i));
		sp.add(panel);
		this.add(sp);
	}
		
	
}
