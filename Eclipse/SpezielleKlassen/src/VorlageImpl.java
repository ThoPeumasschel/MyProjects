

public class VorlageImpl extends Vorlage {
	
	public static void main(String...args) {
		
	
	VorlageImpl impl = new VorlageImpl();
	impl.setCode(10);
	System.out.println(impl.getCode() + " " + impl.getName());

	}
	
	public String getName() {
		return "VorlageImpl";
	}
	
}
