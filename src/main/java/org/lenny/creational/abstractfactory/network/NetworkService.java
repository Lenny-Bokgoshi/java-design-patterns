package org.lenny.creational.abstractfactory.network;

import creational.abstractfactory.SomeService;

public class NetworkService implements SomeService {

	@Override
	public String runService() {
		return "Network service running";
	}

}
