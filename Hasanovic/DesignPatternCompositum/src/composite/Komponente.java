package composite;

public abstract class Komponente implements IKomponente
{
	private String name;
	private String pfad;
	private Komponente parent; //in welcher komponente stecke ich gerade drin?
	//...
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPfad() {
		return pfad;
	}
	public void setPfad(String pfad) {
		this.pfad = pfad;
	}
	public Komponente getParent() {
		return parent;
	}
	public void setParent(Komponente parent) {
		this.parent = parent;
	}
	
	
	
	
	
	
	
	
}
