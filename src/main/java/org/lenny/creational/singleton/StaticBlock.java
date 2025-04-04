package org.lenny.creational.singleton;

public class StaticBlock {
	
	private static StaticBlock instance;
	
	static {
		instance = new StaticBlock();
	}
	
	private StaticBlock() {}

	public static StaticBlock getInstance() {
		return instance;
	}
}
