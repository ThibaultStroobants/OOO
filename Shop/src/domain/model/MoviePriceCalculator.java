package domain.model;

public class MoviePriceCalculator implements PriceCalculator {

	@Override
	public double calculatePrice(int days) {
		double price = 0;
		price = 5;
		int daysLeft = days - 3;
		if (daysLeft > 0) {
			price += (daysLeft * 2);
		}
		return price;
	}

}
