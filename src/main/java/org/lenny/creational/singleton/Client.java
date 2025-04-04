package org.lenny.creational.singleton;

/* Ensures that a class has only one instance throughout the application 
 * and provides a global access point to that instance.
 * 
 * Examples:
 *	- Database Connection Manager – Ensures only one instance of the database connection pool is created and shared.
 *	- Logging Service – Provides a centralized logging instance to avoid duplicate loggers.
 *	- Configuration Manager – Stores application-wide settings in a single instance.
 *	- Cache Manager – Manages application-wide caching to avoid redundant data fetching.
 *	- Thread Pool Manager – Ensures controlled thread pool usage for resource optimization.
 *
 * */
public class Client {

	// Run one class at a time.
	public static void main(String[] args) {
		// Threadsafe Test: Most Recommended
		ThreadSafe threadInstance1 = ThreadSafe.getInstance();
		ThreadSafe threadInstance2 = ThreadSafe.getInstance();
		System.out.println(threadInstance1);
		System.out.println(threadInstance2);

		// Static Test
		StaticBlock staticInstance1 = StaticBlock.getInstance();
		StaticBlock staticInstance2 = StaticBlock.getInstance();
		System.out.println(staticInstance1);
		System.out.println(staticInstance2);
		
		
		// Lazy Test
		Lazy lazyInstance1 = Lazy.getInstace();
		Lazy lazyInstance2 = Lazy.getInstace();
		System.out.println(lazyInstance1);
		System.out.println(lazyInstance2);
		
		// Bill Pugh Test
		BillPugh billPughInstance1 = BillPugh.getInstance();
		BillPugh billPughInstance2 = BillPugh.getInstance();
		System.out.println(billPughInstance1);
		System.out.println(billPughInstance2);

	}

}
