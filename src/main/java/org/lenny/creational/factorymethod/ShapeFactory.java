package org.lenny.creational.factorymethod;

public class ShapeFactory {
	
	public Shape getFood(String type) {
		if (type == null) {
			return null;
		}

        return switch (type) {
            case "round" -> new Pizza();
            case "square" -> new Sandwich();
            default -> throw new IllegalArgumentException("Unknown shape");
        };
		
	}

}
