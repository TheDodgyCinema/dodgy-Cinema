package com.qa.dodgy.interoperability;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.dodgy.business.service.IShowingService;
import com.qa.dodgy.persistence.domain.Showing;

@Path("showing")
public class ShowingEndPoint {
	
	@Inject
	private IShowingService service;
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Showing getShowing(@PathParam("id") Long id) {
		return service.getShowing(id);
	}

}
