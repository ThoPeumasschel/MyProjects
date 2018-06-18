package innereKlassen;
/*
 * 	Innere Klassen
 * 
 * 
 * 		Typen von inneren Klassen:
 * 
 * 			1. Gruppe: Non-statische, innere Klassen
 * 
 * 				a) Elementklassen
 * 				b) Methodenklassen/lokale Klassen 
 * 				c) Anonyme Klassen
 * 					-> 3 Formen:
 * 						c1) Anonyme Klasse als Untertyp einer bereits existierenden Klasse
 * 						c2) Anonyme Klasse als (anonymer) Implementierer eines existierenden Interface
 * 						c3) Anonyme Klasse als Argument in Parameterklammern(Methodenaufruf)
 * 
 * 
 * 
 * 
 * 			2. Gruppe: Statische innere Klassen
 * 
 * 				-> Elementklassen, welche static sind
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class Main 
{

	//Anonyme Klasse vom Typ c1) --> anonymer Erweiterer der Klasse GeometrischeForm
	GeometrischeForm form=new GeometrischeForm() //diese anonyme klasse agiert als attribut der klasse Main!
	{
		private int durchmesser;
		
		@Override
		public double berechneFlaeche()
		{
			return durchmesser*2;
		}
		
		public double berechneKreiszahl() //diese methode ist nur hier innerhalb dieser klasse direkt bekannt(polymorphie!)
		{
			return 0;
		}
	};
	
	//Anonyme Klase vom Typ c2) --> Ein anonymer Implementierer eines Interface
	IMessbar messen=new IMessbar()  //-> hier wird KEIN objekt des Interface erzeugt, sondern von der anonymen Klasse, welche das Interface implementiert!
	{
		@Override
		public void messung()
		{
			
			
			printGeometrischeForm(form);
			
			
			//Anonyme Klasse Typ c3) --> Ein anonymer Untertyp von GeometrischForm, welcher als Argument eines Methodenaufrufs agiert
			printGeometrischeForm(new GeometrischeForm()
					{
						
						private String nameDerForm="LalaForm";
						
						
						
				
						@Override
						public String toString()
						{
							return "Ich bin eine anonyme Form, welche als Argument eines Methodenaufrufs agiert...";
						}
				
				
				
					});
		}
		
		
		
		
		
		
	};
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		Main m=new Main();
		double flaeche=m.form.berechneFlaeche(); //hier wird die methode aus der anonymen klasse aufgerufen
		
	}
	
	
	private void printGeometrischeForm(GeometrischeForm form)
	{
		System.out.println(form);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void testErzeugenVonInnen()
	{
		
		//erste variante:
		Aussen aussen=new Aussen();
		Aussen.Innen innen=aussen.new Innen();
		
		//zweite variante:
		Aussen.Innen ausseninnen=new Aussen().new Innen();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
