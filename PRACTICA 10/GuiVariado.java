import java.awt.*;

class  guiVariado
{
	public static void main(String[] args) 
	{
		Frame ventana = new Frame("Ejemplo");
		ventana.setLayout(new BorderLayout()); // NO es necesario ya que ya lo tiene por defecto

		Panel botones = new Panel();
		botones.setLayout(new GridLayout(2,1));
		botones.add("North",new Button("Boton1"));
		botones.add("South",new Button("Boton2"));
		
		Panel lista = new Panel();
		lista.setLayout(new BorderLayout());
		List list = new List();
		list.add("Lista-1");
		list.add("Lista-2");
		list.add("Lista-3");
		list.add("Lista-4");
		lista.add("Center",list);

		Panel etiqueta = new Panel();
		etiqueta.setLayout(new BorderLayout());
		Label etiq = new Label("Etiqueta");
		TextArea area = new TextArea("Area de texto");//,TextArea.SCROLLBARS_BOTH);
		etiqueta.add("North",etiq);
		etiqueta.add("Center",area);

		Panel comandos = new Panel();
		TextField campo = new TextField("Campo de texto");
		Checkbox check = new Checkbox("Checkbox");
		Choice mlist = new Choice();
		mlist.add("Manolo");
		comandos.add(campo);
		comandos.add(check);
		comandos.add(mlist);

		Panel norte = new Panel();
		norte.setLayout(new GridLayout(1,3));
		norte.add(botones);
		norte.add(etiqueta);
		norte.add(lista);
		ventana.add("North",norte);
		ventana.add("South",comandos);
		ventana.setVisible(true);
	}
}
