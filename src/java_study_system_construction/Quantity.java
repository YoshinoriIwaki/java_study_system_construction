package java_study_system_construction;

public class Quantity {
	static final int MIN = 1;
	static final int MAX = 100;

	int value;

	Quantity(int value){
		if(value < MIN) throw new IllegalArgumentException("incorrect: min value is less than " + MIN);
		if(value > MAX) throw new IllegalArgumentException("incorrect: max value is more than " + MAX);
		this.value = value;
	}

	boolean canAdd(Quantity other) {
		int added = addValue(other);
		return added <= MAX;
	}

	Quantity add(Quantity other) {
		if(!canAdd(other)) throw new IllegalArgumentException("incorrect: sum value is more than" + 100);
		int added = addValue(other);
		return new Quantity(added);
	}

	private int addValue(Quantity other) {
		return this.value + other.value;
	}

}
