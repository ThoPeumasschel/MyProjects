package testdb_peu;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("It is about to run...");
		MySQLAccess dao = new MySQLAccess();
	    dao.readDataBase();
	    System.out.println("... it ran ...");

	}

}
