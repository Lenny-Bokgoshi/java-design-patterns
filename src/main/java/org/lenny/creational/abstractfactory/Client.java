package org.lenny.creational.abstractfactory;

public class Client {
	private SomeService service;
	private Response response;

	public Client(AbstractFactory factory) {
		service = factory.createService();
		response = factory.createResponse();
	}

	public void communicate() {
		if (service != null && response != null) {
			System.out.println(service.runService());
			System.out.println(response.getResponse());
		}
	}
}
