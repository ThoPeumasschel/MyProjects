package nachrichten;

public class Zeitung extends Quelle
{
	private String verlag;
	
	
	public Zeitung(String name, Vermittler v) {
		super(name, v);
		// TODO Auto-generated constructor stub
	}


	public String getVerlag() {
		return verlag;
	}


	public void setVerlag(String verlag) {
		this.verlag = verlag;
	}

	
	
	
	
	
	
}
