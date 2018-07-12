package kartons;

public class GanzzahlKarton extends BasicKarton {

	private int inhalt;
	
	public GanzzahlKarton(String aufschrift, int inhalt){
		super(aufschrift);
		this.inhalt = inhalt;
	}

	@Override
	public boolean isEmpty() {
		
		return inhalt == 0;
	}

	@Override
	public void deleteInhalt() {
		if(this.isEmpty()){
			System.out.println(getAufschrift() + " ist bereits leer");
		}else{
			inhalt = 0;
			System.out.println(getAufschrift() + ": Inhalt gelöscht!");
		}
		
	}
	public int getInhalt(){
		return inhalt;
	}
	
	

}
