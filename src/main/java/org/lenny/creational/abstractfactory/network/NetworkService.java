package org.lenny.creational.abstractfactory.network;


import org.lenny.creational.abstractfactory.SomeService;

public class NetworkService implements SomeService {

	@Override
	public String runService() {
		return "Network service running";
	}

}
