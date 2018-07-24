package mvc;
import java.sql.*;

import com.microsoft.sqlserver.jdbc.SQLServerException;
/*
 * 		Datenbankverbindungen in Java:
 * 
 * 
 * 			-> JDBC
 * 
 * 				-> API für DB-Verbindungen
 * 				-> Basis aller DB-Frameworks
 * 
 * 
 * 			-> JPA(Java Persistence API)
 * 
 * 
 * 			-> Objektrelationales Mapping
 * 				-> Hibernate 
 * 
 * 
 * 
 */
public class Model 
{
	//model muss den controler kennen:
	private Controler controler;
	private Connection con;
	private PreparedStatement statement;
	private ResultSet result;
	
	public Model(Controler c)
	{
		controler=c;
	}
	
	public void dbVerbindung(String dbName)
	{
		//treiber laden
		try 
		{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} 
		catch (ClassNotFoundException e) 
		{
			controler.vermittleMeldungAnView("Laden des Treibers fehlgeschlagen: " + e.getMessage());
		}
		
		//mit dem server verbinden
		try
		{
			con=DriverManager.getConnection("jdbc:sqlserver://localhost:50880;databasename=" + dbName + ";integratedSecurity=true;");
			ladeKunden();
		}
		catch(SQLServerException e)
		{
			controler.vermittleMeldungAnView("Fehler bei der Zusammenarbeit mit dem Server... " + e.getMessage());
		}
		catch(SQLException e)
		{
			controler.vermittleMeldungAnView("Verbindung mit DB-Server gescheitert: " + e.getMessage());
		}
		
	}
	
	private void ladeKunden()
	{
		String sql="SELECT * FROM Kunde WHERE Kunde.Name LIKE '?*'";
		try
		{
			statement=con.prepareStatement(sql);
			
			//das ergebnis in form eines resultsets:
			result=statement.executeQuery();
			controler.vermittleMeldungAnView("Kunden erfolgreich geladen");
			sendeDatenAnControler();
			
		}
		catch(SQLException e)
		{
			controler.vermittleMeldungAnView("Fehler beim Laden der Kundendaten..." + e.getMessage());
		}
		
		
	}
	
	private void sendeDatenAnControler() 
	{
		String[] spalten;
		Object[][] daten;
		try
		{
			spalten=new String[result.getMetaData().getColumnCount()];
			daten=new Object[30][result.getMetaData().getColumnCount()];
			for(int i=0;i<spalten.length;i++)
			{
				spalten[i]=result.getMetaData().getColumnName(i+1);
			}
			
			
			int index=0;
			while(result.next())
			{
				daten[index][0]=result.getInt("PK");
				daten[index][1]=result.getString("Vorname");
				daten[index][2]=result.getString("Name");
				daten[index][3]=result.getString("Beruf");
				daten[index][4]=result.getString("KundeNr");
				index++;
				
			}
			controler.vermittleDatenAnView(spalten, daten);
			
		}
		catch(SQLException e)
		{
			controler.vermittleMeldungAnView("Fehler beim Laden der Datensätze: " + e.getMessage());
		}
		
		
		
		
		
		
	}
	
	
	
	
	
}
