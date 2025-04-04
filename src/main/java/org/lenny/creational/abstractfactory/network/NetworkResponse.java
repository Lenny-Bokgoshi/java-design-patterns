package org.lenny.creational.abstractfactory.network;

import creational.abstractfactory.Response;

public class NetworkResponse implements Response {

	@Override
	public String getResponse() {
		return "Network response";
	}

}
