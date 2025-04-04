package org.lenny.creational.abstractfactory.database;

import creational.abstractfactory.SomeService;

public class DatabaseService implements SomeService {

	@Override
	public String runService() {
		return "Database service running";
	}

}
