package org.lenny.creational.prototype;

public abstract class Vehicle {
	private int wheels;
	private long price;
	
	public Vehicle() {}
	
	public Vehicle(Vehicle target) {
		if (target != null) {
			this.wheels = target.wheels;
			this.price = target.price;
		}
	}
	
	public abstract Vehicle clone();
	
	public abstract boolean isClone(Vehicle target);

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
	

}
