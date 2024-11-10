package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion_db {
	
	private static final String URL = "jdbc:mysql://localHost:3306/headway?serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
	
	public static Connection getConexion() throws SQLException,ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(URL,USERNAME,PASSWORD);
	}

}
