import java.awt.*;
class Textfield 
{
	public static void main(String[] args) 
	{
		 Frame v = new Frame ("Ejemplo textfield y text area");
		 v.setLayout(new BorderLayout());
		 Panel etiqueta = new Panel();
		 Panel text = new Panel();
		 v.add("West",etiqueta);
		 v.add("East",text);
		 Label nombre = new Label("Nombre");
		 Label texto = new Label("Texto");
		 TextField textNombre = new TextField();
		 TextArea textDescripcion = new TextArea();
		 etiqueta.add(nombre);
		 etiqueta.add(texto);
		 text.add(textNombre);
		 text.add(textDescripcion);
		 v.setVisible(true);

	}
}
