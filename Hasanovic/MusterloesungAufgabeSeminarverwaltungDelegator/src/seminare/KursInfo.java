package seminare;

public class KursInfo 
{
	//hält referenz auf seinen client(dozent/teilnehmer)
	private IKursInfo client;
	//referenz auf das singleton seminarverwaltung
	private ISeminarverwaltung clientSv;
	
	public KursInfo(IKursInfo client)
	{
		this.client=client;
	}
	
	//hinzufügen der seminarverwaltung
	public void addSeminarverwaltung(ISeminarverwaltung sv)
	{
		clientSv=sv;
	}
	
	//dienste des delegators:
	public void printKursUebersicht()
	{
		if(clientSv!=null)
		{
			StringBuilder ausgabe=new StringBuilder();
			for(int i=0;i<clientSv.getSeminare().length;i++)
			{
				if(clientSv.getSeminare()[i]!=null)
				{
					ausgabe.append(clientSv.getSeminare()[i].getThema() + " ");
					ausgabe.append(clientSv.getSeminare()[i].getDozi().getName() + " ");
					
				}
				
			}
			System.out.println("KursInfo -> " + ausgabe);
		}
		
		
		
		
	}
	
	
}
