package collections;

public class Person {
	String name;
	String telNummer;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelNummer() {
		return telNummer;
	}

	public void setTelNummer(String telNummer) {
		this.telNummer = telNummer;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((telNummer == null) ? 0 : telNummer.hashCode());
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
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (telNummer == null) {
			if (other.telNummer != null)
				return false;
		} else if (!telNummer.equals(other.telNummer))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", telNummer=" + telNummer + "]";
	}
	
	
	
	
}
