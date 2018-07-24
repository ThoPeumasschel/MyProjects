package bruchrechner;

public class Bruch
{
	private int ganzzahl;
	private int zaehler;
	private int nenner;
	private String vorzeichen;

	// Konstruktoren
	public Bruch()
	{
		this.ganzzahl = 0;
		this.zaehler = 0;
		this.nenner = 0;
		this.vorzeichen = "+";	
	}

	public Bruch(int ganzzahl, int zaehler, int nenner, String vorzeichen)
	{
		this.ganzzahl = ganzzahl;
		this.zaehler = zaehler;
		this.nenner = nenner;
		this.vorzeichen = vorzeichen;
	}

	// setter / getter
	public int getGanzzahl()
	{
		return ganzzahl;
	}

	public void setGanzzahl(int ganzzahl)
	{
		this.ganzzahl = ganzzahl;
	}

	public int getZaehler()
	{
		return zaehler;
	}

	public void setZaehler(int zaehler)
	{
		this.zaehler = zaehler;
	}

	public int getNenner()
	{
		return nenner;
	}

	public void setNenner(int nenner)
	{
		this.nenner = nenner;
	}

	public String getVorzeichen()
	{
		return vorzeichen;
	}

	public void setVorzeichen(String vorzeichen)
	{
		this.vorzeichen = vorzeichen;
	}

	@Override
	public String toString()
	{
		return "Ergebnis: " + vorzeichen + ganzzahl + " " + zaehler + "/" + nenner;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ganzzahl;
		result = prime * result + nenner;
		result = prime * result
			+ ((vorzeichen == null) ? 0 : vorzeichen.hashCode());
		result = prime * result + zaehler;
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bruch other = (Bruch) obj;
		if (ganzzahl != other.ganzzahl)
			return false;
		if (nenner != other.nenner)
			return false;
		if (vorzeichen == null)
		{
			if (other.vorzeichen != null)
				return false;
		} else if (!vorzeichen.equals(other.vorzeichen))
			return false;
		if (zaehler != other.zaehler)
			return false;
		return true;
	}
	
	

}
