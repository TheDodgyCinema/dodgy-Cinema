package com.qa.dodgy.interoperability;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.dodgy.business.service.IScreenService;
import com.qa.dodgy.persistence.domain.Screen;

@Path("screen")
public class ScreenEndPoint {
	
	@Inject
	private IScreenService service;
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Screen getScreen(@PathParam("id") Long id) {
		return service.getScreen(id);
	}

}
