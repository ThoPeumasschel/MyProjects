package globalgoods_peuschel;



public class Main {

	public static void main(String[] args) throws Exception {
		 Database db = new Database();
		  db.connectToDB();
		  db.readProducts();
		  db.close();
	}

}
