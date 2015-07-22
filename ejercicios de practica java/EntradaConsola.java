import java.io.*;

public class EntradaConsola
{
	public static int leeEntero(){
		int n=0;
		String cadena="";
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try
		{
			cadena = br.readLine();
		}
		catch (java.io.IOException e)
		{
			System.out.println("No se pudo leer correctamente el n�mero entero");
		}
		n = (Integer.valueOf(cadena)).intValue();
		return n;
	}

	public static float leeReal(){
		float n=0;
		String cadena="";
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try
		{
			cadena = br.readLine();
		}
		catch (java.io.IOException e)
		{
			System.out.println("No se pudo leer correctamente el n�mero real");
		}
		n = (Float.valueOf(cadena)).floatValue();
		return n;
	}
    
	public static String leeCadena(){
		String cadena="";
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try
		{
			cadena = br.readLine();
		}
		catch (java.io.IOException e)
		{
			System.out.println("No se pudo leer correctamente la cadena de caracteres");
		}
		return cadena;
	}

	public static char leeCaracter(){
		char c='\0';
		try
		{
			c = (char) System.in.read();
		}
		catch (java.io.IOException e)
		{
			System.out.println("No se pudo leer correctamente el caracter");
		}
		return c;
	}
}
                               
                                        
