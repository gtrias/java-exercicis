import java.awt.*;

public class  Gui1
{
	public static void main(String args []) {
		Frame f = new Frame("Ejemplo");
		f.setLayout(new FlowLayout());
		Button bSi = new Button("SI");
		Button bNo = new Button("NO");
		Label l = new Label("Nombre");
		f.add(l);
		f.add(bSi);
		f.add(bNo);
		f.pack();
		f.setVisible(true);
	}

}
