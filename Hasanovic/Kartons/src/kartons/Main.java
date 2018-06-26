package kartons;

public class Main {

	public static void main(String[] args) 
	{
	    //kartons basteln
	    KartonKarton oberster=new KartonKarton("Oberster", 5);
	    KartonKarton mitte=new KartonKarton("mitte", 5);
	    KartonKarton unterster=new KartonKarton("unterster", 5);
	    GanzzahlKarton pi=new GanzzahlKarton("PIKarton", 3);
	    GanzzahlKarton vier=new GanzzahlKarton("VierKarton", 4);
	    TextKarton wort=new TextKarton("TextKartonWort", "Wort");
	    TextKarton keineahnung=new TextKarton("TextKartonKeineahnung", "keine");
	    
	    //lustig verschachteln wie man lustig ist
	    oberster.addInhalt(mitte);
	    mitte.addInhalt(pi);
	    mitte.addInhalt(keineahnung);
	    mitte.addInhalt(unterster);
	    unterster.addInhalt(vier);
	    unterster.addInhalt(wort);
	    
	    //inhalte ausgeben
	    System.out.println(mitte.getInhalte());
	    System.out.println("-----------------------");
	    System.out.println(oberster.getInhalteR());
	    
	    //verschieben des vier-kartons in den karton "mitte":
	    vier.verschiebeNach(mitte);
	    System.out.println("-----------------------");
	    System.out.println(mitte.getInhalte());
	    System.out.println("-----------------------");
	    System.out.println(oberster.getInhalteR());
	    
	    
	    
	    
	    
	    
	}

}
