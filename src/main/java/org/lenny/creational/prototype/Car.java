package org.lenny.creational.prototype;

public class Car extends Vehicle {
	private String color;

	public Car(int wheels, long price, String color) {
		setWheels(wheels);
		setPrice(price);
		this.color = color;
	}

	public Car(Car target) {
		super(target);
		if (target != null) {
			this.color = target.color;
		}
	}

	@Override
	public Vehicle clone() {
		return new Car(this);
	}

	@Override
	public boolean isClone(Vehicle target) {
		if (target instanceof Car) {
			Car t = (Car) target;
			if (color == t.color && getWheels() == t.getWheels() && getPrice() == t.getPrice()) {
				System.out.println(this + " and " + t + " are clones");
				return true;
			}
		}
		System.out.println(this + " and " + target + " are NOT clones");
		return false;
	}

}
