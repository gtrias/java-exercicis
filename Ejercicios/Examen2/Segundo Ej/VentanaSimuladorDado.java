import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class VentanaSimuladorDado extends Frame
{
	TextField tTiradas,tfVeces1,tfVeces2,tfVeces3,tfVeces4,tfVeces5,tfVeces6;
	Checkbox cManual,cAutomatico;
	Button bSimular, bLimpiar, bSalir;
	TextArea taResultados;
	CheckboxGroup grupoModo;
	int [] dado = {0,0,0,0,0,0};
	VentanaSimuladorDado(String titulo){
		super(titulo);

		tTiradas = new TextField();
		
		grupoModo = new CheckboxGroup();
		cManual = new Checkbox("Manual");
		cAutomatico = new Checkbox("Automatico");
		cManual.setCheckboxGroup(grupoModo);
		cAutomatico.setCheckboxGroup(grupoModo);
		
		tfVeces1 = new TextField("Nº veces1: ");
		tfVeces1.setEditable(false);
		tfVeces2 = new TextField("Nº veces2: ");
		tfVeces2.setEditable(false);
		tfVeces3 = new TextField("Nº veces3: ");
		tfVeces3.setEditable(false);
		tfVeces4 = new TextField("Nº veces4: ");
		tfVeces4.setEditable(false);
		tfVeces5 = new TextField("Nº veces5: ");
		tfVeces5.setEditable(false);
		tfVeces6 = new TextField("Nº veces6: ");
		tfVeces6.setEditable(false);

		Panel norte = new Panel();
		norte.setLayout(new GridLayout(6,6));

		norte.add(new Label("Nºtiradas"));
		norte.add(new Label("Modo"));
		norte.add(tTiradas);
		norte.add(cManual);
		norte.add(new Label(""));
		norte.add(cAutomatico);
		norte.add(tfVeces1);
		norte.add(tfVeces2);
		norte.add(tfVeces3);
		norte.add(tfVeces4);
		norte.add(tfVeces5);
		norte.add(tfVeces6);

		taResultados = new TextArea();
		taResultados.setEditable(false);
		bSimular = new Button("Simular");
		bLimpiar = new Button("Limpiar");
		bSalir = new Button("Salir");

		Panel sur = new Panel();
		sur.setLayout(new FlowLayout());
		sur.add(taResultados);
		sur.add(bSimular);
		sur.add(bLimpiar);
		sur.add(bSalir);

		setLayout(new BorderLayout());
		add("North",norte);
		add("Center",sur);
		
		bSimular.addActionListener(new ControlAccion());
		addWindowListener(new EventoVentana());
		setResizable(false);

	}
	public void simulacion(int veces){
		Random r = new Random();
		for(int i=0; i<veces; i++){
			int resultado = r.nextInt(6);
			dado[i] = dado[i]++;
			taResultados.append(" "+i+1);
			actualizarText();
		}
		
	}
	public void actualizarText(){
		/*tfVeces1.setText(dado[0]);
		tfVeces2.setText(dado[1]);
		tfVeces3.setText(dado[2]);
		tfVeces3.setText(dado[3]);
		tfVeces3.setText(dado[4]);
		tfVeces3.setText(dado[5]);
		*/
	}
	
	public class ControlAccion implements ActionListener
	{
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == bSimular){
				if(grupoModo.getSelectedCheckbox == cManual)
					simulacion(1);
				else
					simulacion();
			}
		}
	}

	public class EventoVentana extends WindowAdapter
	{
		public void windowClosing(WindowEvent we) { System.exit(0); }
	}
}
