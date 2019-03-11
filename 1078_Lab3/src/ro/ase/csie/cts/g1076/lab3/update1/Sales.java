package ro.ase.csie.cts.g1076.lab3.update1;

public class Sales {
	public float computeDiscountedPrice(
			int productType, float price, int accountYears) {
		float finalPrice = 0;
		float clientDiscount = (accountYears > 10) ? (float) 15 / 100 : (float) accountYears / 100;
		if (productType == 1) {
			finalPrice = price;
		} else if (productType == 2) {
			finalPrice = (price - (0.1f * price)) - clientDiscount * (price - (0.1f * price));
		} else if (productType == 3) {
			finalPrice = (price - (0.25f * price)) - clientDiscount * (price - (0.25f * price));
		} else if (productType == 4) {
			finalPrice = (price - (0.35f * price)) - clientDiscount * (price - (0.35f * price));
		}
		return finalPrice;
	}
}
