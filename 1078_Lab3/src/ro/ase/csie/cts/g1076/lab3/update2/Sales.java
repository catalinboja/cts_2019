package ro.ase.csie.cts.g1076.lab3.update2;

public class Sales {
	public float computeDiscountedPrice(
			ProductTypes productType, float price, int accountYears) {
		float finalPrice = 0;
		float clientDiscount = (accountYears > SalesConstants.PREMIUM_AGE) ? (float) SalesConstants.PREMIUM_DISCOUNT / 100 : (float) accountYears / 100;
		if (productType == ProductTypes.NORMAL) {
			finalPrice = price;
		} else if (productType == ProductTypes.NEW) {
			finalPrice = (price - (SalesConstants.NEW_DISCOUNT * price)) - clientDiscount * (price - (SalesConstants.NEW_DISCOUNT * price));
		} else if (productType == ProductTypes.OLD) {
			finalPrice = (price - (SalesConstants.OLD_DISCOUNT * price)) - clientDiscount * (price - (SalesConstants.OLD_DISCOUNT * price));
		} else if (productType == ProductTypes.REFURBISHED) {
			finalPrice = (price - (SalesConstants.REFURBISHED_DISCOUNT * price)) - clientDiscount * (price - (SalesConstants.REFURBISHED_DISCOUNT * price));
		}
		return finalPrice;
	}
}
