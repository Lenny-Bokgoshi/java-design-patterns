package org.lenny.creational.factorymethod;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/* An interface for creating an object, but lets subclasses decide which class to instantiate.
 * It helps in creating objects without specifying the exact class.
 * 
 * Examples:
 *	- Notification Service: Create different notification objects 
 *		(e.g., Email, SMS, Push) using a factory based on configuration or user preference.
 *	- Report Generator: Generate different types of reports (PDF, Excel, HTML)
 *		by selecting the appropriate report class through a factory.
 *	- DAO (Data Access Object) Factory: Return the correct DAO implementation 
 *		(e.g., SQL, MongoDB, or REST) depending on the database being used.
 *	- UI Component Factory: Dynamically generate UI elements like buttons or
 *		text fields depending on user roles or themes.
 *	- Parser Factory: Return appropriate parser classes (e.g., XMLParser, JSONParser)
 *		based on input file format.
 *
 * */
public class Client {

	ShapeFactory factory = new ShapeFactory();
	Shape roundFood = factory.getFood("round");
	Shape squareFood = factory.getFood("square");
	
	@Test
	void factoryMethodTest() {
		assertEquals("round", roundFood.getShape());
	    assertEquals("square", squareFood.getShape());
	}

}
