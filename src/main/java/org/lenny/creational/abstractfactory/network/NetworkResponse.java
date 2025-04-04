package org.lenny.creational.abstractfactory.network;


import org.lenny.creational.abstractfactory.Response;

public class NetworkResponse implements Response {

	@Override
	public String getResponse() {
		return "Network response";
	}

}
