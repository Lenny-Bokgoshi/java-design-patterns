package org.lenny.creational.prototype;

/* is used to create new objects by copying an existing object (prototype) instead of creating from scratch.
 * It helps in cloning objects efficiently.
 *  
 * Examples
 *	- Document Templates: Clone predefined document templates (e.g., invoice, report, resume) instead of recreating them each time.
 *	- UI Element Duplication: Clone complex UI components like forms, buttons, or panels with preset styles and behaviors.
 *	- Business Workflow Instances: Create copies of predefined business process workflows or configurations.
 *	- Object Caching: Store and clone frequently used objects (like database query configurations or API request templates).
 *	- Game or Simulation Objects: Duplicate characters, environments, or scenarios from a base prototype to maintain consistency. 
 *  
 * */
public class Client {

	public static void main(String[] args) {
		Vehicle carOne = new Car(4, 30000, "red");
		Vehicle carTwo = carOne.clone();
		
		carOne.isClone(carTwo);
		carTwo.isClone(carOne);
		
		
		Vehicle truckOne = new Truck(6, 800000, false);
		Vehicle truckTwo = truckOne.clone();
		
		truckOne.isClone(truckTwo);
		truckTwo.isClone(truckOne);
		
		carOne.isClone(truckOne);

	}

}
