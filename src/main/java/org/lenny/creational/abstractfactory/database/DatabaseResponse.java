package org.lenny.creational.abstractfactory.database;


import org.lenny.creational.abstractfactory.Response;

public class DatabaseResponse implements Response {

	@Override
	public String getResponse() {
		return "Database response";
	}

}
