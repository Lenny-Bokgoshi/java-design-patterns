package org.lenny.creational.abstractfactory.database;


import org.lenny.creational.abstractfactory.AbstractFactory;
import org.lenny.creational.abstractfactory.Response;
import org.lenny.creational.abstractfactory.SomeService;

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
