package collections;

public class Brot implements Comparable
{
	private String sorte;
	private int gewichtInGramm;
	
	
	
	
	public Brot(String sorte, int gewichtInGramm) {
		super();
		this.sorte = sorte;
		this.gewichtInGramm = gewichtInGramm;
	}
	public String getSorte() {
		return sorte;
	}
	public void setSorte(String sorte) {
		this.sorte = sorte;
	}
	public int getGewichtInGramm() {
		return gewichtInGramm;
	}
	public void setGewichtInGramm(int gewichtInGramm) {
		this.gewichtInGramm = gewichtInGramm;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + gewichtInGramm;
		result = prime * result + ((sorte == null) ? 0 : sorte.hashCode());
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Brot other = (Brot) obj;
		if (gewichtInGramm != other.gewichtInGramm)
			return false;
		if (sorte == null) {
			if (other.sorte != null)
				return false;
		} else if (!sorte.equals(other.sorte))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Brot [sorte=" + sorte + ", gewichtInGramm=" + gewichtInGramm + "]";
	}
	
	/*
	 *  Die compareTo(Object) stammt aus dem Interface Comparable - das Interface MUSS implementiert werden, wenn man seine Objekte
	 *  in einer Sortier-Collection mit einer impliziten, "natürlichen" Ordnung, sortieren möchte
	 *  
	 *  
	 *  	1. Die compareTo() liefert entweder einen positiven, einen negativen Int-Wert, oder eine 0
	 * 
	 * 		2. Wenn ein negativer Intwert geliefert wird: Das eigene Objekt ist kleiner als das andere
	 * 
	 * 		3. Wenn ein postivier Wert geliefert wird: Das eigene Objekt ist größer als das andere
	 * 
	 * 		4. Wenn eine 0 geliefert wird: Beide Objekte sind gleich
	 * 
	 * 
	 * 
	 */
	
	@Override
	public int compareTo(Object o) 
	{
		
		if(sorte.compareTo(((Brot)o).getSorte())==0)
		
			if(gewichtInGramm<((Brot)o).getGewichtInGramm())
			{
				return -1;
			}
			else if(gewichtInGramm>((Brot)o).getGewichtInGramm())
			{
				return 1;
			}
			else
			{
				return 0;
			}
		else
		{
			return sorte.compareTo(((Brot)o).getSorte());
		}
	}
	
	
	
	
	
	
	
}
