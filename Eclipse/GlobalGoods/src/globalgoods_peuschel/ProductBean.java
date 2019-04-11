package globalgoods_peuschel;

import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ProductBean {

	private int id;
	private String name;
	
	public ProductBean() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//	public List<ProductBean> productListFromDb() {
//		return Database;
//		
//	}
	
}
