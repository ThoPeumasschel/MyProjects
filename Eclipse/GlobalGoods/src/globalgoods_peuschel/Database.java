package globalgoods_peuschel;

//Adapted from http://www.vogella.com/tutorials/MySQLJava/article.html
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class Database {

	private static EntityManager entityMgrObj = Persistence.createEntityManagerFactory("GlobalGoods").createEntityManager();
	private static EntityTransaction transactionObj = entityMgrObj.getTransaction();

	
	private Connection connect = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	final private String host = "localhost";
	final private String user = "root";
	final private String passwd = "Welcome19*";
	final private String database = "northwind";

	public void connectToDB() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			connect = DriverManager.getConnection(
					"jdbc:mysql://" + host + "/" + database + "?" + "user=" + user + "&password=" + passwd);

		} catch (Exception e) {
			throw e;
		}
	}

	public static List<ProductBean> getAllProducts() {
		Query queryObj = entityMgrObj.createQuery("SELECT s FROM SchoolEntityManager s");
		@SuppressWarnings("unchecked")
		List<ProductBean> productList = queryObj.getResultList();
		if (productList != null && productList.size() > 0) {			
			return productList;
		} else {
			return null;
		}
	}
	
	public void readProducts() throws Exception {
		try {
			statement = connect.createStatement();
			resultSet = statement.executeQuery("select * from " + database + ".products");
			while (resultSet.next()) {
				int productID = resultSet.getInt("ProductID");
				String productName = resultSet.getString("ProductName");
				int supplierID = resultSet.getInt("SupplierID");
				int categoryID = resultSet.getInt("CategoryID");
				String qunatityPerUnit = resultSet.getString("QuantityPerUnit");
				float unitprice = resultSet.getFloat("UnitPrice");
				int unitsInStock = resultSet.getInt("UnitsInStock");
				int unitsOnOrder = resultSet.getInt("UnitsOnOrder");				
				int reorderLevel = resultSet.getInt("ReorderLevel");
				int discontinued = resultSet.getInt("Discontinued");
				System.out.println(String.format("ProductID: "+productID+" ProductName: "+productName+" "
						+ "SupplierID: "+supplierID+" CategoryID: "+categoryID+" QuantityPerUnit: "+qunatityPerUnit+
						" UnitPrice: "+unitprice+" UnitsInStock: "+unitsInStock+" UnitsOnOrder: "+unitsOnOrder+" ReorderLevel: "+reorderLevel+
						"Discontinued: "+discontinued));
			}
		} catch (Exception e) {
			throw e;
		}
	}

	// You need to close the resultSet
	public void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}

			if (statement != null) {
				statement.close();
			}

			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {

		}
	}

}
