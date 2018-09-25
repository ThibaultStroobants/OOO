package domain.db;

import java.util.ArrayList;

import domain.model.Product;

public class ProductDb {
	
	private ArrayList<Product> products;
	
	public ProductDb() {
		this.products = new ArrayList<>();
	}
	
	public void add(Product product) {
		this.products.add(product);
	}
	
	public Product get(String id) {
		return this.products.get(this.getIndexOfId(id));
	}
	
	public int getIndexOfId(String id) {
		for (int i = 0; i < this.products.size(); i++) {
			if (this.products.get(i).getId().equals(id)) {
				return i;
			}
		}
		throw new RuntimeException("Id not found");
	}
	
	public boolean isProduct(String id) {
		for (Product product : products) {
			if (product.getId().equals(id)) {
				return true;
			}
		}
		return false;
	}

}
