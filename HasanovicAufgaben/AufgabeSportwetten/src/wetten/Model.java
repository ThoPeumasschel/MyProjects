package wetten;

import java.sql.*;


import com.mysql.jdbc.PreparedStatement;

public class Model
{
	private Controler controler;
	private Connection con;
	private PreparedStatement statement;
	private ResultSet result;
	
	public Model(Controler c)
	{
		controler=c;
	}
	
	public void dbVerbindung()
	{
		//treiber laden
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) 
		{
			controler.vermittleMeldungAnView("Laden des Treibers fehlgeschlagen: " + e.getMessage());
		}
		
		//mit dem server verbinden
		try
		{	//jdbc:mysql://localhost/db_imperium?useSSL=false&serverTimezone=UTC
			con=DriverManager.getConnection("jdbc:mysql://localhost/db_imperium?useSSL=false&serverTimezone=UTC", "root", "");
			
		}
//		catch(SQLServerException e)
//		{
//			controler.vermittleMeldungAnView("Fehler bei der Zusammenarbeit mit dem Server... " + e.getMessage());
//		}
		catch(SQLException e)
		{
			controler.vermittleMeldungAnView("Verbindung mit DB-Server gescheitert: " + e.getMessage());
		}
		
	}

	public void dbVerbindung(String eingabe)
	{
		// TODO Auto-generated method stub
		
	}
}
