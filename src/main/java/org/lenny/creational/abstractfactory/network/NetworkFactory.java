package org.lenny.creational.abstractfactory.network;

import creational.abstractfactory.AbstractFactory;
import creational.abstractfactory.Response;
import creational.abstractfactory.SomeService;

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
