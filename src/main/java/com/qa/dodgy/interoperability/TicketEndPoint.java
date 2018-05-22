package com.qa.dodgy.interoperability;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.dodgy.business.service.ITicketService;
import com.qa.dodgy.persistence.domain.Ticket;
import com.qa.dodgy.util.JSONUtil;

@Path("ticket")
public class TicketEndPoint {
		
		@Inject
		private ITicketService service;
		
		@Inject
		private JSONUtil util;
		
		@GET
		@Path("/{id}")
		@Produces("application/json")
		public Ticket getTicket(@PathParam("id") Long id) {
			return service.getTicket(id);
		}
		
		@DELETE
		@Path("/{id}")
		@Produces("application/json")
		public Ticket deleteTicket(@PathParam("id") Long id) {
			return service.deleteTicket(id);
		}
		
		@POST
		@Produces("application/json")
		public Ticket addTicket(String jsonTicket) {
			Ticket ticket = util.getObjectForJSON(jsonTicket, Ticket.class);
			return service.addTicket(ticket);
		}
}
