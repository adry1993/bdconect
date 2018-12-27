package holajade;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class bdcpneccion {
	Connection conn = null;
	private static String db_="base";

	public void dbConnection() {
		try {
			//aca va a la conneccion a ala bd tu metodo que te has bajad0 del inter ya es muy viejo usa la documentacion de 
			// mysql connector https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-usagenotes-connect-drivermanager.html#connector-j-examples-connection-drivermanager
			//jdbc:mysql://localhost/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
			conn=DriverManager.getConnection("jdbc:mysql://localhost/base?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"
					+"user= &password= ");
			//aca cambia gordita tu usuario y tu password del mysql y el nombre de la base de datos luego de localhost jdbc:mysql://localhost/gordita 
			if (conn != null) {
				System.out.println("Conectado a la base de datos"+db_);
			}
		}catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
	}
	public static void main(String[] args) {
		//aca se crea una nueva instancia de la clase y del metodo para poder ver los resultados 
		new bdcpneccion().dbConnection();
	}

}

