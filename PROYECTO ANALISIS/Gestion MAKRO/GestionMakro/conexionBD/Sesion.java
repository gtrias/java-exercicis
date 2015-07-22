package conexionBD;
import java.sql.*;
public class Sesion {
	private String url;
	private String usuario;
	private String password;
	private Connection conexion;
	private ResultSet rs;
	Sesion(){
		this.url = "jdbc:mysql://localhost/makro";
		this.usuario = "root";
		this.password = "937892790";
	}
	public void conectar(){
		try
		{
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (Exception e)
		{
			e.printStackTrace();
		} 
		try
		{
			conexion = DriverManager.getConnection (url,usuario, password);
		} catch (SQLException e){
			// error
		}
	}
	public String consulta(){
		String retorno="";
		try{
			Statement s = conexion.createStatement();
			rs = s.executeQuery ("select * from persona");
			while (rs.next())
			{
			   retorno = (rs.getInt (1) + " " + rs.getString (2)+ " " + rs.getDate(3));
			}
		}catch(SQLException e){
			//error
		}
		return(retorno);
		
		
	}
}
