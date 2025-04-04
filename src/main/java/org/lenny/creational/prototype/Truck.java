package org.lenny.creational.prototype;

public class Truck extends Vehicle {
	private boolean hasTrailer;

	public Truck(Truck target) {
		super(target);
		if (target != null) {
			this.hasTrailer = target.hasTrailer;
		}
	}

	public Truck(int wheels, long price, boolean hasTrailer) {
		this.setWheels(wheels);
		this.setPrice(price);
		this.hasTrailer = hasTrailer;
	}

	@Override
	public Vehicle clone() {
		return new Truck(this);
	}

	@Override
	public boolean isClone(Vehicle target) {
		if (target instanceof Truck) {
			Truck t = (Truck) target;
			if (hasTrailer == t.hasTrailer && getWheels() == t.getWheels() && getPrice() == t.getPrice()) {
				System.out.println(this + " and " + t + " are clones");
				return true;
			}
		}
		System.out.println(this + " and " + target + " are NOT clones");
		return false;
	}

}
