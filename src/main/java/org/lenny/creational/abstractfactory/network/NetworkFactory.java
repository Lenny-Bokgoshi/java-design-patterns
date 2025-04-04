package org.lenny.creational.abstractfactory.network;


import org.lenny.creational.abstractfactory.AbstractFactory;
import org.lenny.creational.abstractfactory.Response;
import org.lenny.creational.abstractfactory.SomeService;

public class NetworkFactory implements AbstractFactory {

	@Override
	public SomeService createService() {
		return new NetworkService();
	}

	@Override
	public Response createResponse() {
		return new NetworkResponse();
	}

}
