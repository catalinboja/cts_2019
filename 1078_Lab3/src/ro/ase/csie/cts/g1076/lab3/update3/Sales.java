package ro.ase.csie.cts.g1076.lab3.update3;

public class Sales {
	
	private float computeClientDiscount(int accountYears) {
		if (accountYears > SalesConstants.PREMIUM_AGE)
			return (float) SalesConstants.PREMIUM_DISCOUNT / 100;
		else
			return (float) accountYears / 100;
	}
	
	private float getDiscountedPrice(float price, float discountPercentage) {
		return price*(1-discountPercentage);
	}
	
	public float computeDiscountedPrice(
			ProductTypes productType, float price, int accountYears) {
		float finalPrice = 0;
		
		float clientDiscount = computeClientDiscount(accountYears);
		
		if (productType == ProductTypes.NORMAL) {
			finalPrice = price;
		} else if (productType == ProductTypes.NEW) {
			float discountedPrice = getDiscountedPrice(price, SalesConstants.NEW_DISCOUNT);
			finalPrice = getDiscountedPrice(discountedPrice,clientDiscount);
		} else if (productType == ProductTypes.OLD) {
			float discountedPrice = getDiscountedPrice(price, SalesConstants.OLD_DISCOUNT);
			finalPrice = getDiscountedPrice(discountedPrice,clientDiscount);
		} else if (productType == ProductTypes.REFURBISHED) {
			float discountedPrice = getDiscountedPrice(price, SalesConstants.REFURBISHED_DISCOUNT);
			finalPrice = getDiscountedPrice(discountedPrice,clientDiscount);
		}
		return finalPrice;
	}
}
