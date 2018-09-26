package domain.model;

public class Movie implements Product {
	
	private String title;
	private String id;
	private PriceCalculator calculator;
	
	public Movie() {
		calculator = new MoviePriceCalculator();
	}
	
	public Movie(String title, String id) {
		this.setTitle(title);
		this.setId(id);
		calculator = new MoviePriceCalculator();
	}

	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public double getPrice(int days) {
		
		return calculator.calculatePrice(days);
	}

}
