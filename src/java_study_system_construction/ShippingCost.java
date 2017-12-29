package java_study_system_construction;

public class ShippingCost {
	static final int minimumForFree = 3000;
	static final int cost = 500;

	int basePrice;

	ShippingCost(int basePrice){
		this.basePrice = basePrice;
	}

	int amount() {
		if(basePrice < minimumForFree) return cost;

		return 0;
	}

	int ShippingCost(int basePrice) {
		ShippingCost cost = new ShippingCost(basePrice);
		return cost.amount();
	}
}
