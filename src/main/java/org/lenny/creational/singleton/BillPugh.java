package org.lenny.creational.singleton;

public class BillPugh {
	
	private BillPugh() {}
	
	private static class InnerStaticClass {
		private static final BillPugh billPughInstance = new BillPugh();
	}
	
	public static BillPugh getInstance() {
		return InnerStaticClass.billPughInstance;
	}

}
