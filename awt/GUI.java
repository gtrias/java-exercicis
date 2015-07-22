import java.awt.*;
import java.awt.event.*;
public class  GUI
{
	public static void main(String[] args) 
	{
			Frame ventana = new Frame("Ejemplo de Border Layout");
			ventana.setLayout(new BorderLayout());
			CheckBoxGroup group = new CheckBoxGroup();
			CheckBox CB1 = new CheckBox("CB1",false,group);
			CheckBox CB2 = new CheckBox("CB2",true,group);
 			
			ventana.add("North",new Button("Norte"));
			ventana.add("South",new Button("Sur"));
			ventana.add("Center",new Button("Centro"));
			ventana.add("East",new Button("Este"));
			ventana.add("West",group);
			//ventana.add("West",new Button("Oeste"));
//			ventana.pack();
			ventana.setSize(400,300);
			ventana.setVisible(true);

		 
	}
}
