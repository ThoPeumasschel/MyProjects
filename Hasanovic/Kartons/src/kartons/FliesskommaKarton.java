package kartons;

public class FliesskommaKarton extends BasicKarton {

	double inhalt;

	public FliesskommaKarton(String aufschrift, double inhalt) {
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
			new IllegalStateException(this.getAufschrift() + " ist bereits leer");
		}else{
			inhalt = 0;
			System.out.println(getAufschrift() + ": Inhalt gelöscht!");
		}
	}
	public double getInhalt(){
		return inhalt;
	}
}
