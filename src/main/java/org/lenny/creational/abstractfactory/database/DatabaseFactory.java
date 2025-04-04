package org.lenny.creational.abstractfactory.database;

import creational.abstractfactory.AbstractFactory;
import creational.abstractfactory.Response;
import creational.abstractfactory.SomeService;

public class DatabaseFactory implements AbstractFactory {

	@Override
	public SomeService createService() {
		return new DatabaseService();
	}

	@Override
	public Response createResponse() {
		return new DatabaseResponse();
	}

}
