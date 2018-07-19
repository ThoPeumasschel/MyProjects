
public class CountInstances {

	private static int numInstances = 0;
	
	protected static int getNumInstances() {
		return numInstances;
	}
	
	private static void addInstances() {
		numInstances++;
	}
	
	CountInstances() {
		CountInstances.addInstances();
	}
	
	public static void main(String[] args) {

		System.out.println("Starting with " + CountInstances.getNumInstances()
		+ " Instances.");
		for (int i = 0; i < 10; i++) 
			new CountInstances();
		System.out.println("Ending with " + CountInstances.getNumInstances()
		+ " Instances.");
		
	}

}
