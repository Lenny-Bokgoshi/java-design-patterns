package org.lenny.creational.builder;

/* Used to construct complex objects step by step, 
 * allowing you to create different representations of an object using the same building process.
 * 
 * Examples
 *	- Building Complex DTOs (Data Transfer Objects): Assemble complex request or response objects with many optional fields
 *			 (e.g., user profiles, order requests).
 *	- Report Generation: Build a report step-by-step (title, table of contents, data sections, charts)
 *		 using a builder.
 *	- Email Construction: Create emails with subject, body, attachments, recipients, etc., using a fluent builder.
 *	- Configuration Objects: Build configuration settings objects (e.g., for database, security, caching)
 *		 where many options are optional.
 *	- Test Data Builders: In unit tests, build test objects with only the necessary data,
 *		 improving readability and maintainability.
 * 
 * */
public class Client {

	public static void main(String[] args) {
		 ApartmentBuilder builder = new ApartmentBuilder();
		 
		 Apartment apartment1 = builder
				 .setSqm(480)
				 .setRooms(6)
				 .setCity("Midrand")
				 .setArea("Carlswald")
				 .setKitchen(true)
				 .build();
		 apartment1.display();
		 
		 Apartment apartment2 = builder
				 .setRooms(2)
				 .setCity("Johannesburg")
				 .build();
		 apartment2.display();

	}

}
