package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDatabase
{

	public static void main(String[] args)
	{
		Connection con = null;

		try
		{
			// Treiber registrieren
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
			// Verbindung mit HSQLDB herstellen
			con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/testdb", "SA",
				"");
			if (con != null)
				System.out.println("Verbindung hat geklappt");
			else
				System.out.println("Verbindung hat nicht geklappt");
		} catch (Exception e)
		{
			e.printStackTrace(System.out);
		}
	}

}
