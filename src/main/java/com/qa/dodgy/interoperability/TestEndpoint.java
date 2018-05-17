package com.qa.dodgy.interoperability;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.qa.dodgy.business.service.IHelloWorldService;

@Path("test")
public class TestEndpoint {
	@Inject
	private IHelloWorldService service;

	@GET
	@Produces("application/json")
	public String sayHello() {
		return service.sayHello();
	}

}
