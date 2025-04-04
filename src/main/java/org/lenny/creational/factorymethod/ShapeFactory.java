package org.lenny.creational.factorymethod;

public class ShapeFactory {
	
	public Shape getFood(String type) {
		if (type == null) {
			return null;
		}
		
		switch (type) {
		case "round": return new Pizza();
		case "square": return new Sandwich();
		default: throw new IllegalArgumentException("Unknown shape");
		}
		
	}

}
