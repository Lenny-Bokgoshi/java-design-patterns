package org.lenny.creational.abstractfactory.database;

import creational.abstractfactory.Response;

public class DatabaseResponse implements Response {

	@Override
	public String getResponse() {
		return "Database response";
	}

}
