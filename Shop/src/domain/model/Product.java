package domain.model;

public interface Product {
	
	String getTitle();
	String getId();
	void setTitle(String title);
	void setId(String id);
	double getPrice(int days);

}
