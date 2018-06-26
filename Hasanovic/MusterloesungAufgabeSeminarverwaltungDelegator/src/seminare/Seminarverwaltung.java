package seminare;

public class Seminarverwaltung implements ISeminarverwaltung
{

	//hält alle seminare
	private Seminar[] seminare;
	//kann auch den delegator kursinfo nutzen
	private static KursInfo delegator;
	//singleton-referenz
	private static Seminarverwaltung sv;
	private int anzSeminare;
	
	private Seminarverwaltung() {
		
		delegator=new KursInfo(null);
		seminare=new Seminar[30];
	}
	
	public static Seminarverwaltung getSV()
	{
		if(sv == null)
		{
			sv=new Seminarverwaltung();
			//die singleton-seminarverwaltung sollte in ihrem delegator eine referenz auf sich selbst halten:
			delegator.addSeminarverwaltung(sv);
		}
		return sv;
	}
	
	
	@Override
	public Seminar[] getSeminare() {
		return seminare;
	}
	
	public void addSeminar(Seminar s)
	{
		if(anzSeminare<seminare.length)
		{
			seminare[anzSeminare++]=s;
		}
	}
	
	public void getKursInfos()
	{
		delegator.printKursUebersicht();
	}
	
	
	
}
