package org.lenny.creational.abstractfactory;


import org.lenny.creational.abstractfactory.database.DatabaseFactory;
import org.lenny.creational.abstractfactory.network.NetworkFactory;

/* An interface to create families of related objects without specifying their concrete classes.
 * It is used when multiple objects from different classes are designed to work together and 
 * must be created together consistently.
 * 
 * Examples
 * - UI Theme System: Create related UI components (buttons, menus, text fields) for different themes 
 * 	like Dark Mode or Light Mode using one factory per theme.
 * Cross-Database Support: For multiple databases (e.g., MySQL, Oracle, MongoDB), an abstract factory can create related DAOs and connection classes for each database type.

Cloud Provider Integration: Provide an abstract factory to create services (e.g., storage, messaging, compute) for AWS, Azure, or GCP.

Payment Gateway Integration: Create families of objects related to payment processing (transaction handler, fraud checker, receipt generator) for different payment gateways (e.g., PayPal, Stripe).

Document Converter System: Support exporting content to families of formats (PDF, DOCX, HTML), each with its own text, image, and table exporters.
 * 
 * 
 * **/
public class Main {

	public static void main(String[] args) {
		Client factory1 = new Client(new DatabaseFactory());
		factory1.communicate();
		
		
		Client factory2 = new Client(new NetworkFactory());
		factory2.communicate();
	}

}
