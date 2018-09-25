package domain.model;

import domain.db.ProductDb;

public class Shop {
	
	private ProductDb products;
	
	public Shop() {
		products = new ProductDb();
	}
	
	public void addProduct(Product product) {
		this.products.add(product);
	}
	
	public Product getProduct(String id) {
		return this.products.get(id);
	}
	
	public boolean isProduct(String id) {
		return this.products.isProduct(id);
	}

}
