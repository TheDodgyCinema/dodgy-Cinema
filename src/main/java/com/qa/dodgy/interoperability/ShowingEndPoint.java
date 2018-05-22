package com.qa.dodgy.interoperability;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.dodgy.business.service.IShowingService;
import com.qa.dodgy.persistence.domain.Showing;
import com.qa.dodgy.util.IJSONUtil;

@Path("showing")
public class ShowingEndPoint {
	
	@Inject
	private IShowingService service;
	
	@Inject
	private IJSONUtil jsonUtil;
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Showing getShowing(@PathParam("id") Long id) {
		return service.getShowing(id);
	}
	
	@DELETE
	@Path("/{id}")
	@Produces("application/json")
	public Showing deleteShowing(@PathParam("id") Long id) {
		return service.deleteShowing(id);
	}
	
	@GET
	@Produces("application/json")
	public String getShowings() {
		return jsonUtil.getJSONForObject(service.getShowings());
	}

}
