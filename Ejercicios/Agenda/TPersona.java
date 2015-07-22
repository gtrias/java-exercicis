public class TPersona
{
	 private String nombre;
	 private String direccion;
	 private String edad;
	 private String telefono;

	 TPersona(String nombre, String direccion, String edad, String telefono){
		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;
		this.telefono = telefono;
	 }

	 public String obtenerNombre(){
		 return(nombre);
	 }
	 public String obtenerDireccion(){
		 return(direccion);
	 }
	 public String obtenerEdad(){
		 return(edad);
	 }
	 public String obtenerTelefono(){
		 return(telefono);
	 }
}
