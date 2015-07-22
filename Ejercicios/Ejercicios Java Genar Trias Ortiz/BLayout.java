import java.awt.*;

public class  BLayout
{
	public static void main(String[] args) 
	{
			Frame f = new Frame("Ejemplo de Border Layout");
			f.setLayout(new BorderLayout());
		 
 			
			f.add("North",new Button("Norte"));
			f.add("South",new Button("Sur"));
			f.add("East",new Button("Este"));
			f.add("Oest",new Button("Oeste"));
			f.pack();
			//f.setVisisble(true);

		 
	}
}
