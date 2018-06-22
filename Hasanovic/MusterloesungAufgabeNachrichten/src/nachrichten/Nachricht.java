package nachrichten;

public class Nachricht {
	private String nachricht;
	private Quelle quelle;
	
	public Nachricht(String nachricht, Quelle quelle) {
		super();
		this.nachricht = nachricht;
		this.quelle = quelle;
	}
	public String getNachricht() {
		return nachricht;
	}
	public void setNachricht(String nachricht) {
		this.nachricht = nachricht;
	}
	public Quelle getQuelle() {
		return quelle;
	}
	public void setQuelle(Quelle quelle) {
		this.quelle = quelle;
	}
	
	
	
	
	
}
