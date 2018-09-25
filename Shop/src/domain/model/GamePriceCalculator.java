package domain.model;

public class GamePriceCalculator implements PriceCalculator {

	@Override
	public double calculatePrice(int days) {
		double price = 0;
		price = days * 3;
		return price;
	}

}
