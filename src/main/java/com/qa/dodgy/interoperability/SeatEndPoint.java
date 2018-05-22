package com.qa.dodgy.interoperability;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.dodgy.business.service.ISeatService;
import com.qa.dodgy.persistence.domain.Seat;

@Path("seat")
public class SeatEndPoint {

	@Inject
	private ISeatService service;

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Seat getSeat(@PathParam("id") Long id) {
		return service.getSeat(id);
	}
	
	@DELETE
	@Path("/{id}")
	@Produces("application/json")
	public Seat deleteSeat(@PathParam("id") Long id) {
		return service.deleteSeat(id);
	}
}
