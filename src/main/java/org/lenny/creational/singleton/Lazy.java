package org.lenny.creational.singleton;

public class Lazy {
	
	private static Lazy instance;
	
	private Lazy() {}
	
	public static Lazy getInstace() {
		if (instance == null) {
			instance = new Lazy();
		}
		return instance;
	}

}
