package com.qa.dodgy.interoperability;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("test")
public class TestEndpoint {
	@GET
	@Produces("application/json")
	public String sayHello() {
		return "{\"message\": \"Hello my dodgy friend!\")";
	}

}
